package com.company.application.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

@MetaClass(name = "application_StoreWithNoSuchProduct")
public class StoreWithNoSuchProduct extends BaseUuidEntity {
    private static final long serialVersionUID = -8520997172552744464L;

    @MetaProperty
    private Store store;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}