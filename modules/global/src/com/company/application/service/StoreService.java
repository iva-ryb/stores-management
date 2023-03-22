package com.company.application.service;

import com.company.application.entity.Retailer;
import com.company.application.entity.Store;

public interface StoreService {
    String NAME = "application_StoreService";

    Integer getNumberPurchasesInStore(Store store);

    Integer getNumberRetailerPurchases(Retailer retailer);
}