package com.company.application.web.screens.retailer;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Retailer;

@UiController("application_retailer.edit")
@UiDescriptor("retailer-edit.xml")
@EditedEntityContainer("retailerDc")
@LoadDataBeforeShow
public class RetailerEdit extends StandardEditor<Retailer> {
}