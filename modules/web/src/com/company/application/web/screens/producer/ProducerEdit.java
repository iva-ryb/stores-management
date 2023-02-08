package com.company.application.web.screens.producer;

import com.company.application.entity.Address;
import com.company.application.service.ProducerService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Producer;

import javax.inject.Inject;

@UiController("application_Producer.edit")
@UiDescriptor("producer-edit.xml")
@EditedEntityContainer("producerDc")
@LoadDataBeforeShow
public class ProducerEdit extends StandardEditor<Producer> {
    @Inject
    private ProducerService retailService;

    @Inject
    private DataManager dataManager;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Producer> event) {
        event.getEntity().setUser(retailService.getCurrentUser());
        event.getEntity().setAddress(dataManager.create(Address.class));
    }


}