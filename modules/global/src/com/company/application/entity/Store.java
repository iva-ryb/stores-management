package com.company.application.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "APPLICATION_STORE")
@Entity(name = "application_Store")
@NamePattern("%s %s|number, name")
public class Store extends StandardEntity {
    private static final long serialVersionUID = 2078988562490126540L;

    @Column(name = "NUMBER", nullable = false, unique = true)
    private String number;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STORE_CHAIN_ID")
    private StoreChain storeChain;

    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    @OneToMany(mappedBy = "store")
    private List<StoreProduct> storeProducts;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

    public List<StoreProduct> getStoreProducts() {
        return storeProducts;
    }

    public void setStoreProducts(List<StoreProduct> storeProducts) {
        this.storeProducts = storeProducts;
    }
}