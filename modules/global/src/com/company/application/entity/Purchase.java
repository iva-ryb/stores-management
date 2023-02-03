package com.company.application.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "APPLICATION_PURCHASE")
@Entity(name = "application_Purchase")
public class Purchase extends StandardEntity {
    private static final long serialVersionUID = -3528418992981867835L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SHOP_ID")
    private Store store;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "LIST_OF_PRODUCTS_ID")
    private List<StoreProduct> products;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<StoreProduct> getProducts() {
        return products;
    }

    public void setProducts(List<StoreProduct> products) {
        this.products = products;
    }
}