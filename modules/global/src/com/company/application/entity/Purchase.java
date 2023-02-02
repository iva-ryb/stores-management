package com.company.application.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Table(name = "APPLICATION_PURCHASE")
@Entity(name = "application_Purchase")
public class Purchase extends StandardEntity {
    private static final long serialVersionUID = -3528418992981867835L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SHOP_ID")
    private Shop shop;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "LIST_OF_PRODUCTS_ID")
    private List<ListOfProducts> products;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<ListOfProducts> getProducts() {
        return products;
    }

    public void setProducts(List<ListOfProducts> products) {
        this.products = products;
    }
}