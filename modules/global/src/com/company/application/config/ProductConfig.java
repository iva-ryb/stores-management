package com.company.application.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.defaults.DefaultInteger;


@Source(type = SourceType.DATABASE)
public interface ProductConfig extends Config {

    @Property("count of product in the store")
    @DefaultInteger(10)
    int getCount();

    void setCount(int count);
}
