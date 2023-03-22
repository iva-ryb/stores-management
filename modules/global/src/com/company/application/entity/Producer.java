package com.company.application.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "APPLICATION_PRODUCER")
@Entity(name = "application_Producer")
@NamePattern("%s|fullName")
public class Producer extends StandardEntity {
    private static final long serialVersionUID = 4986540848611986490L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "FULL_NAME")
    private String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
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