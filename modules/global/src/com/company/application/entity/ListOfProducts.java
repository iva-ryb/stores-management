package com.company.application.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "APPLICATION_LIST_OF_PRODUCTS")
@Entity(name = "application_ListOfProducts")
public class ListOfProducts extends StandardEntity {
    private static final long serialVersionUID = -3762454563574648072L;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHOP_ID")
    private Shop shop;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @Column(name = "COUNT")
    private Integer count;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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