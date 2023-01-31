package com.company.application.web.screens.storechain;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.StoreChain;

@UiController("application_StoreChain.browse")
@UiDescriptor("store-chain-browse.xml")
@LookupComponent("storeChainsTable")
@LoadDataBeforeShow
public class StoreChainBrowse extends StandardLookup<StoreChain> {
}