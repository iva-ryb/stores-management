package com.company.application.web.screens.shop;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Shop;

@UiController("application_Shop.edit")
@UiDescriptor("shop-edit.xml")
@EditedEntityContainer("shopDc")
@LoadDataBeforeShow
public class ShopEdit extends StandardEditor<Shop> {
}