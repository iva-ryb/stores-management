package com.company.application.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.type.Factory;


@Source(type = SourceType.DATABASE)
public interface ProductConfig extends Config {

    @Property("application_StoreProduct.count")
    int getCount();

    void setCount(int count);
}
