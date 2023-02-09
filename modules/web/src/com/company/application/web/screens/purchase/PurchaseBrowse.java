package com.company.application.web.screens.purchase;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Purchase;

@UiController("application_Purchase.browse")
@UiDescriptor("purchase-browse.xml")
@LookupComponent("purchasesTable")
@LoadDataBeforeShow
public class PurchaseBrowse extends StandardLookup<Purchase> {
}