package com.company.application.web;

import com.company.application.entity.Retailer;
import com.haulmont.cuba.gui.screen.ScreenOptions;

public class RetailerOption implements ScreenOptions {
    private final Retailer retailer;

    public RetailerOption(Retailer retailer) {
        this.retailer = retailer;
    }

    public Retailer getRetailer() {
        return retailer;
    }
}
