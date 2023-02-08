package com.company.application.web.screens.producer;

import com.haulmont.cuba.gui.screen.*;
import com.company.application.entity.Producer;

@UiController("application_Producer.browse")
@UiDescriptor("producer-browse.xml")
@LookupComponent("producersTable")
@LoadDataBeforeShow
public class ProducerBrowse extends StandardLookup<Producer> {
}