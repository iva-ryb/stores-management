package com.company.application.web.screens.storechain;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.StoreChain;

@UiController("application_StoreChain.edit")
@UiDescriptor("store-chain-edit.xml")
@EditedEntityContainer("storeChainDc")
@LoadDataBeforeShow
public class StoreChainEdit extends StandardEditor<StoreChain> {
}