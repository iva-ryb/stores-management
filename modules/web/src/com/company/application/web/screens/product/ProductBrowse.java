package com.company.application.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Product;

@UiController("application_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}