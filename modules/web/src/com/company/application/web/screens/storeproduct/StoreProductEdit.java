package com.company.application.web.screens.storeproduct;

import com.company.application.entity.Product;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.StoreProduct;

import javax.inject.Inject;

@UiController("application_StoreProduct.edit")
@UiDescriptor("store-product-edit.xml")
@EditedEntityContainer("storeProductDc")
@LoadDataBeforeShow
public class StoreProductEdit extends StandardEditor<StoreProduct> {
    @Inject
    private PickerField<Product> productField;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        if(!productField.isEmpty()) {
            productField.setEditable(false);
        }
    }
}