package com.company.application.web.screens.producerservice;

import com.company.application.entity.*;
import com.company.application.service.ProducerService;
import com.company.application.web.ProducerOption;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.List;

@UiController("application_ProducerServiceScreen")
@UiDescriptor("producer-service-screen.xml")
public class ProducerServiceScreen extends Screen {
    @Inject
    private ProducerService producerService;
    @Inject
    private PickerField<Store> storePickerField;
    @Inject
    private PickerField<Producer> producerPickerField1;
    @Inject
    private TextField<Integer> countTextField;
    @Inject
    private PickerField<Producer> producerField;
    @Inject
    private PickerField<Product> productField;
    @Inject
    private Notifications notifications;
    @Inject
    private CollectionContainer<ProductWhoseAmountIsLessThan> productWhoseAmountIsLessThanDc;
    @Inject
    private CollectionContainer<StoreWithNoSuchProduct> storeWithNoSuchProductsDc;

    @Install(to = "productField.lookup", subject = "screenOptionsSupplier")
    private ScreenOptions productFieldLookupScreenOptionsSupplier() {
        return new ProducerOption(producerField.getValue());
    }

    @Subscribe("getProductsButton")
    public void onButton1Click(Button.ClickEvent event) {
        if (producerPickerField1.isEmpty() || storePickerField.isEmpty() || countTextField.isEmpty()) {
            notifications.create(Notifications.NotificationType.WARNING).withCaption("Enter all required parameters.").show();
        } else if (countTextField.isEmpty()) {
            notifications.create(Notifications.NotificationType.WARNING).withCaption("Count parameter must be positive.").show();
        } else {
            List<ProductWhoseAmountIsLessThan> products = productWhoseAmountIsLessThanDc.getMutableItems();
            products.clear();
            products.addAll(producerService.getProductsWhoseAmountIsLessThan(
                    producerPickerField1.getValue(),
                    storePickerField.getValue(),
                    countTextField.getValue()
            ));
        }
    }

    @Subscribe("getStoreButton")
    public void onButton2Click(Button.ClickEvent event) {
        if (producerField.isEmpty() || productField.isEmpty()) {
            notifications.create(Notifications.NotificationType.WARNING).withCaption("Enter all required parameters.").show();
        } else {
            List<StoreWithNoSuchProduct> stores = storeWithNoSuchProductsDc.getMutableItems();
            stores.clear();
            stores.addAll(producerService.getStoresWithNoSuchProduct(producerField.getValue(), productField.getValue()));
        }
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        productField.setEnabled(false);
    }

    @Subscribe("producerField")
    public void onProducerField2ValueChange(HasValue.ValueChangeEvent<Producer> event) {
        productField.setEnabled(event.getValue() != null);
        if (event.getValue() == null) {
            productField.clear();
            productField.setEnabled(false);
        } else if (!event.getValue().equals(event.getPrevValue())) {
            productField.clear();
            productField.setEnabled(true);
        }
    }

    
    



}