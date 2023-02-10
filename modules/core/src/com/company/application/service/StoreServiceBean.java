package com.company.application.service;

import com.company.application.core.StoreBean;
import com.company.application.entity.Retailer;
import com.company.application.entity.Store;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(StoreService.NAME)
public class StoreServiceBean implements StoreService {

    @Inject
    private StoreBean storeBean;

    @Override
    public Integer getNumberPurchasesInStore(Store store) {
        return storeBean.getNumberPurchasesInTheStore(store);
    }

    @Override
    public Integer getNumberRetailerPurchases(Retailer retailer) {
        return storeBean.getNumberOfRetailerPurchases(retailer);
    }
}