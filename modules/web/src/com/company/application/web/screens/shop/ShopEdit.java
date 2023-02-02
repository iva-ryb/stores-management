package com.company.application.web.screens.shop;

import com.company.application.entity.Address;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Shop;

import javax.inject.Inject;

@UiController("application_Shop.edit")
@UiDescriptor("shop-edit.xml")
@EditedEntityContainer("shopDc")
@LoadDataBeforeShow
public class ShopEdit extends StandardEditor<Shop> {
    @Inject
    private DataManager dataManager;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Shop> event) {
        event.getEntity().setAddress(dataManager.create(Address.class));
    }


}