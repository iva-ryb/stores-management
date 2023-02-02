package com.company.application.web.screens.purchase;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Purchase;

@UiController("application_Purchase.edit")
@UiDescriptor("purchase-edit.xml")
@EditedEntityContainer("purchaseDc")
@LoadDataBeforeShow
public class PurchaseEdit extends StandardEditor<Purchase> {
}