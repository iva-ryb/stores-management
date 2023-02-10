package com.company.application.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.validation.constraints.Positive;

@MetaClass(name = "application_ProductWhoseAmountIsLessThan")
public class ProductWhoseAmountIsLessThan extends BaseUuidEntity {
    private static final long serialVersionUID = 6816946119626108178L;

    @MetaProperty
    private Product product;

    @MetaProperty
    @Positive(message = "Count must be positive! ")
    private Integer count;

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
}