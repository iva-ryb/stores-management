package com.company.application.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "APPLICATION_PRICE_HISTORY")
@Entity(name = "application_PriceHistory")
public class PriceHistory extends StandardEntity {
    private static final long serialVersionUID = 8382972737943931709L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_PRICE_CHANGE", nullable = false)
    private Date dateOfPriceChange;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHOP_ID")
    private Store store;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Store getShop() {
        return store;
    }

    public void setShop(Store store) {
        this.store = store;
    }

    public Date getDateOfPriceChange() {
        return dateOfPriceChange;
    }

    public void setDateOfPriceChange(Date dateOfPriceChange) {
        this.dateOfPriceChange = dateOfPriceChange;
    }
}