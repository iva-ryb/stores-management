package com.company.application.web;

import com.company.application.entity.Store;
import com.haulmont.cuba.gui.screen.ScreenOptions;

public class StoreOption implements ScreenOptions {
    private final Store store;

    public StoreOption(Store store) {
        this.store = store;
    }

    public Store getStore() {
        return store;
    }
}
