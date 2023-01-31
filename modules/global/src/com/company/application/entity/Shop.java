package com.company.application.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "APPLICATION_SHOP")
@Entity(name = "application_Shop")
@NamePattern("%s %s|name,number")
public class Shop extends StandardEntity {
    private static final long serialVersionUID = 2078988562490126540L;

    @Column(name = "NUMBER", nullable = false, unique = true)
    private String number;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STORE_CHAIN_ID", nullable = false)
    private StoreChain storeChain;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoreChain getStoreChain() {
        return storeChain;
    }

    public void setStoreChain(StoreChain storeChain) {
        this.storeChain = storeChain;
    }
}