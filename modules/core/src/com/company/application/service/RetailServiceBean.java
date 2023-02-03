package com.company.application.service;

import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(RetailService.NAME)
public class RetailServiceBean implements RetailService {
    @Inject
    private UserSessionSource userSessionSource;

    @Override
    public User getCurrentUser() {
        return userSessionSource.getUserSession().getUser();
    }
}