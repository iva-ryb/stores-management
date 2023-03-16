package com.company.application.web.screens.storeproduct;

import com.company.application.entity.Product;
import com.company.application.entity.StoreProduct;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.ArrayList;

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

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        if (getEditedEntity().getPriceHistories() == null) {
            getEditedEntity().setPriceHistories(new ArrayList<>());
        }
        if (getEditedEntity().getPurchaseProducts() == null) {
            getEditedEntity().setPurchaseProducts(new ArrayList<>());
        }
    }
}