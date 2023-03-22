package com.company.application.service;

import com.company.application.entity.*;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service(ProducerService.NAME)
public class ProducerServiceBean implements ProducerService {
    @Inject
    private UserSessionSource userSessionSource;

    @Inject
    private DataManager dataManager;

    @Override
    public User getCurrentUser() {
        return userSessionSource.getUserSession().getUser();
    }

    @Override
    public List<ProductWhoseAmountIsLessThan> getProductsWhoseAmountIsLessThan(Producer producer, Store store, int target) {
        List<ProductWhoseAmountIsLessThan> result = new ArrayList<>();
        List<StoreProduct> storeProducts = dataManager.load(Store.class)
                .query("select e from application_Store e where e.id = :store_id")
                .view("store-view")
                .parameter("store_id", store.getId())
                .one()
                .getStoreProducts().stream()
                .filter(storeProduct -> storeProduct.getProduct().getProducer().equals(producer))
                .filter(storeProduct -> storeProduct.getCount() < target)
                .collect(Collectors.toList());

        for (StoreProduct storeProduct : storeProducts) {
            ProductWhoseAmountIsLessThan product = dataManager.create(ProductWhoseAmountIsLessThan.class);
            product.setProduct(storeProduct.getProduct());
            product.setCount(storeProduct.getCount());
            result.add(product);
        }
        return result;
    }

    @Override
    public List<StoreWithNoSuchProduct> getStoresWithNoSuchProduct(Producer producer, Product product) {
        List<StoreWithNoSuchProduct> result = new ArrayList<>();
        List<Store> stores = dataManager.load(Store.class)
                .query("select e from application_Store e")
                .view("store-view")
                .list()
                .stream()
                .filter(store -> {
                    for (StoreProduct storeProduct : store.getStoreProducts()) {
                        if (storeProduct.getProduct().equals(product)) {
                            return false;
                        }
                    }
                    return true;
                })
                .collect(Collectors.toList());

        for (Store store : stores) {
            StoreWithNoSuchProduct storeWithNoSuchProduct = dataManager.create(StoreWithNoSuchProduct.class);
            storeWithNoSuchProduct.setStore(store);
            result.add(storeWithNoSuchProduct);
        }
        return result;
    }
}