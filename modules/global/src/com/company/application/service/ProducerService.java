package com.company.application.service;

import com.haulmont.cuba.security.entity.User;

public interface ProducerService {
    String NAME = "application_ProducerService";

    User getCurrentUser();
}