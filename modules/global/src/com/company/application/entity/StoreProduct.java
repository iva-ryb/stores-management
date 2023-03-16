package com.company.application.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@PublishEntityChangedEvents
@Table(name = "APPLICATION_STORE_PRODUCT")
@Entity(name = "application_StoreProduct")
@NamePattern("%s %s %s %s|store,product,price,count")
public class StoreProduct extends StandardEntity {
    private static final long serialVersionUID = -3762454563574648072L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STORE_ID")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private Store store;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private Product product;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @NotNull
    @Column(name = "COUNT", nullable = false)
    private Integer count;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "storeProduct")
    @JoinColumn(name = "PRICE_HISTORY_ID")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private List<PriceHistory> priceHistories;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "storeProduct")
    @JoinColumn(name = "PURCHASE_PRODUCTS_ID")
    private List<PurchaseProduct> purchaseProducts;

    public List<PurchaseProduct> getPurchaseProducts() {
        return purchaseProducts;
    }

    public void setPurchaseProducts(List<PurchaseProduct> purchaseProducts) {
        this.purchaseProducts = purchaseProducts;
    }

    public void setPriceHistories(List<PriceHistory> priceHistories) {
        this.priceHistories = priceHistories;
    }

    public List<PriceHistory> getPriceHistories() {
        return priceHistories;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}