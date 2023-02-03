package com.company.application.web.screens.retailer;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Retailer;

@UiController("application_Retailer.browse")
@UiDescriptor("retailer-browse.xml")
@LookupComponent("retailersTable")
@LoadDataBeforeShow
public class RetailerBrowse extends MasterDetailScreen<Retailer> {
}