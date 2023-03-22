package com.company.application.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Product;

@UiController("application_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}