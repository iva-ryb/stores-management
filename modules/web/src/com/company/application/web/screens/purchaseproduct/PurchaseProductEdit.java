package com.company.application.web.screens.purchaseproduct;

import com.company.application.entity.Product;
import com.company.application.web.StoreOption;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.PurchaseProduct;

import javax.inject.Inject;

@UiController("application_PurchaseProduct.edit")
@UiDescriptor("purchase-product-edit.xml")
@EditedEntityContainer("purchaseProductDc")
@LoadDataBeforeShow
public class PurchaseProductEdit extends StandardEditor<PurchaseProduct> {

    @Inject
    private PickerField<Product> productField;

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
}