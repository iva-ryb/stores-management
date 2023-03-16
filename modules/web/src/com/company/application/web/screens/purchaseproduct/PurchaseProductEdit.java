package com.company.application.web.screens.purchaseproduct;

import com.company.application.entity.Product;
import com.company.application.entity.PurchaseProduct;
import com.company.application.entity.StoreProduct;
import com.company.application.web.StoreOption;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("application_PurchaseProduct.edit")
@UiDescriptor("purchase-product-edit.xml")
@EditedEntityContainer("purchaseProductDc")
@LoadDataBeforeShow
public class PurchaseProductEdit extends StandardEditor<PurchaseProduct> {

    @Inject
    private PickerField<Product> productField;

    @Inject
    private Label<String> countLabel;

    @Install(to = "productField.lookup", subject = "screenOptionsSupplier")
    private ScreenOptions productFieldLookupScreenOptionsSupplier() {
        return new StoreOption(getEditedEntity().getPurchase().getStore());
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        if(!productField.isEmpty()) {
            productField.setEditable(false);
        }
    }

    @Subscribe("productField")
    public void onProductFieldValueChange(HasValue.ValueChangeEvent<Product> event) {
        if (event.getValue() == null) {
            countLabel.setValue("Count in the store: ");
        } else {
            StoreProduct storeProduct = getEditedEntity().getPurchase().getStore().getStoreProducts().stream()
                    .filter(storeProduct1 -> event.getValue().equals(storeProduct1.getProduct()))
                    .findAny()
                    .orElse(null);
            countLabel.setValue("Count in the store: " + storeProduct.getCount());
        }
    }


}