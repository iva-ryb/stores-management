package com.company.application.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "APPLICATION_PRODUCT")
@Entity(name = "application_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -1147949572157470160L;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MANUFACTURER_ID")
    private Manufacturer manufacturer;

    @Column(name = "PRICE_FROM_MANUFACTURER", unique = true, nullable = false)
    private BigDecimal priceFromManufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getPriceFromManufacturer() {
        return priceFromManufacturer;
    }

    public void setPriceFromManufacturer(BigDecimal priceFromManufacturer) {
        this.priceFromManufacturer = priceFromManufacturer;
    }
}