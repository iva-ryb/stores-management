package com.company.application.web;

import com.company.application.entity.Producer;
import com.haulmont.cuba.gui.screen.ScreenOptions;

public class ProducerOption implements ScreenOptions {
    private final Producer producer;

    public ProducerOption(Producer producer) {
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }
}
