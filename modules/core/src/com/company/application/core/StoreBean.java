package com.company.application.core;

import com.company.application.entity.Purchase;
import com.company.application.entity.Retailer;
import com.company.application.entity.Store;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component(StoreBean.NAME)
public class StoreBean {
    public static final String NAME = "application_StoreBean";

    @Inject
    private DataManager dataManager;

    public Integer getNumberPurchasesInTheStore(Store store) {
        List<Purchase> purchases = dataManager.load(Purchase.class)
                .query("select e from application_Purchase e where e.store = :store")
                .view("purchase-view")
                .parameter("store", store)
                .list();
        return purchases.size();
    }

    public Integer getNumberOfRetailerPurchases(Retailer retailer) {
        List<Store> stores = dataManager.load(Store.class)
                .query("select e from application_Store e where e.retailer = :retailer")
                .view("store-view")
                .parameter("retailer", retailer)
                .list();
        return stores.stream().mapToInt(this::getNumberPurchasesInTheStore).sum();
    }
}