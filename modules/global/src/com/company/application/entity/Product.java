package com.company.application.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "APPLICATION_PRODUCT")
@Entity(name = "application_Product")
@NamePattern("%s|name")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -1147949572157470160L;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RETAILER_ID")
    private Retailer retailer;

    @Column(name = "PRICE_FROM_RETAILER", unique = true)
    private BigDecimal priceFromRetailer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    public BigDecimal getPriceFromRetailer() {
        return priceFromRetailer;
    }

    public void setPriceFromRetailer(BigDecimal priceFromRetailer) {
        this.priceFromRetailer = priceFromRetailer;
    }
}