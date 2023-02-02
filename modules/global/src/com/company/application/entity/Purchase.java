package com.company.application.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Table(name = "APPLICATION_PERCHASE")
@Entity(name = "application_Perchase")
public class Purchase extends StandardEntity {
    private static final long serialVersionUID = -3528418992981867835L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SHOP_ID")
    private Shop shop;

    @NotNull
    @Column(name = "PRODUCTS", nullable = false)
    private Map<String, Integer> products;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }
}