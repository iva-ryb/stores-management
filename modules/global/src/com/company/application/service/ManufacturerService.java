package com.company.application.service;

import com.haulmont.cuba.security.entity.User;

public interface ManufacturerService {
    String NAME = "application_ManufacturerService";

    User getCurrentUser();
}