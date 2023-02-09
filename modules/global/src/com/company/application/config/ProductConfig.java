package com.company.application.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;


@Source(type = SourceType.DATABASE)
public interface ProductConfig extends Config {

    @Property("count of product in the store")
    int getCount();

    void setCount(int count);
}
