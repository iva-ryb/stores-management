package com.company.application.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "APPLICATION_RETAILER")
@Entity(name = "application_Retailer")
@NamePattern("%s|fullName")
public class Retailer extends StandardEntity {
    private static final long serialVersionUID = 1371068971681857828L;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "FULL_NAME")
    private String fullName;

    @NotNull
    @OneToMany(mappedBy = "retailer", fetch = FetchType.LAZY)
    private List<Store> stores;

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}