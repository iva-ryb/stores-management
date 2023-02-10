package com.company.application.web.screens.storeservice;

import com.company.application.entity.Retailer;
import com.company.application.entity.Store;
import com.company.application.service.StoreService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("application_StoreServiceScreen")
@UiDescriptor("store-service-screen.xml")
public class StoreServiceScreen extends Screen {
    @Inject
    private PickerField<Store> storeField1;
    @Inject
    private StoreService storeService;
    @Inject
    private Label<String> purchasesNumber1;
    @Inject
    private Notifications notifications;
    @Inject
    private Label<String> purchasesNumber2;
    @Inject
    private PickerField<Retailer> retailerField;

    @Subscribe("button1")
    public void onButton1Click(Button.ClickEvent event) {
        if (storeField1.isEmpty()) {
            notifications.create(Notifications.NotificationType.WARNING).withCaption("Enter all required parameters.").show();
        } else {
            purchasesNumber1.setValue("The number of purchases: " + storeService.getNumberPurchasesInStore(storeField1.getValue()).toString());
        }
    }

    @Subscribe("storeField1")
    public void onStoreField1ValueChange(HasValue.ValueChangeEvent<Store> event) {
        if (event.getValue() == null || !event.getValue().equals(event.getPrevValue())) {
            purchasesNumber1.setValue("The number of purchases: ");
        }
    }

    @Subscribe("button2")
    public void onButton2Click(Button.ClickEvent event) {
        if (retailerField.isEmpty()) {
            notifications.create(Notifications.NotificationType.WARNING).withCaption("Enter all required parameters.").show();
        } else {
            purchasesNumber2.setValue("The number of purchases: " +
                    storeService.getNumberRetailerPurchases(retailerField.getValue()));
        }
    }

    @Subscribe("retailerField")
    public void onRetailerFieldValueChange(HasValue.ValueChangeEvent<Retailer> event) {
        if(event.getValue() == null || !event.getValue().equals((event.getPrevValue()))) {
            purchasesNumber2.setValue("The number of purchases: ");
        }
    }







}