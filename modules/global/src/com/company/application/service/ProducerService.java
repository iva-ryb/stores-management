package com.company.application.service;

import com.company.application.entity.*;
import com.haulmont.cuba.security.entity.User;

import java.util.List;

public interface ProducerService {
    String NAME = "application_ProducerService";

    User getCurrentUser();

    List<ProductWhoseAmountIsLessThan> getProductsWhoseAmountIsLessThan(Producer producer, Store store, int target);

    List<StoreWithNoSuchProduct> getStoresWithNoSuchProduct(Producer producer, Product product);
}