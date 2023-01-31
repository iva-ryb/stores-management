package com.company.application.web.screens.shop;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Shop;

@UiController("application_Shop.browse")
@UiDescriptor("shop-browse.xml")
@LookupComponent("shopsTable")
@LoadDataBeforeShow
public class ShopBrowse extends StandardLookup<Shop> {
}