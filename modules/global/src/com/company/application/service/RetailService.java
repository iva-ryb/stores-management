package com.company.application.service;

import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;

public interface RetailService {
    String NAME = "application_RetailService";

    User getCurrentUser();
}