package com.company.application.web.screens.manufacturer;

import com.company.application.service.ManufacturerService;
import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Manufacturer;

import javax.inject.Inject;

@UiController("application_Manufacturer.browse")
@UiDescriptor("manufacturer-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ManufacturerBrowse extends MasterDetailScreen<Manufacturer> {

    @Inject
    private ManufacturerService manufacturerService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Manufacturer> event) {
        event.getEntity().setUser(manufacturerService.getCurrentUser());
    }

}