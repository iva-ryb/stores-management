package com.company.application.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "APPLICATION_PRODUCT")
@Entity(name = "application_Product")
@NamePattern("%s|name")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -1147949572157470160L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCER_ID")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private Producer producer;

    @NotNull
    @Column(name = "PRICE_FROM_PRODUCER")
    private BigDecimal priceFromProducer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public BigDecimal getPriceFromProducer() {
        return priceFromProducer;
    }

    public void setPriceFromProducer(BigDecimal priceFromProducer) {
        this.priceFromProducer = priceFromProducer;
    }
}