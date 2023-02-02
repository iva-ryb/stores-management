package com.company.application.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Table(name = "APPLICATION_MANUFACTURER")
@Entity(name = "application_Manufacturer")
@NamePattern("%s|fullName")
public class Manufacturer extends StandardEntity {
    private static final long serialVersionUID = 4986540848611986490L;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "FULL_NAME")
    private String fullName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToOne(fetch = FetchType.LAZY, optional = false, mappedBy = "id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}