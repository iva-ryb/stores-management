package com.company.application.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ShopType implements EnumClass<String> {

    AT_HOME("at home"),
    SUPERMARKET("supermarket"),
    GIPERMARKET("gipermarket");

    private String id;

    ShopType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ShopType fromId(String id) {
        for (ShopType at : ShopType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}