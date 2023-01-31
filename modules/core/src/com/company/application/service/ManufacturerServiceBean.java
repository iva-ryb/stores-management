package com.company.application.service;

import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(ManufacturerService.NAME)
public class ManufacturerServiceBean implements ManufacturerService {

    @Inject
    private UserSessionSource userSessionSource;

    @Override
    public User getCurrentUser() {
        return userSessionSource.getUserSession().getUser();
    }
}