package com.company.application.web.screens.listofproducts;

import com.company.application.entity.Product;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.ListOfProducts;

import javax.inject.Inject;

@UiController("application_ListOfProducts.edit")
@UiDescriptor("list-of-products-edit.xml")
@EditedEntityContainer("listOfProductsDc")
@LoadDataBeforeShow
public class ListOfProductsEdit extends StandardEditor<ListOfProducts> {
    @Inject
    private DataManager dataManager;

    @Subscribe
    public void onInitEntity(InitEntityEvent<ListOfProducts> event) {
        event.getEntity().setProduct(dataManager.create(Product.class));
    }


}