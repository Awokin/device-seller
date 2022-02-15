package com.sha.deviceseller.service;

import com.sha.deviceseller.model.Application;

import java.util.List;

    public interface ApplicationService {

        List<Application> listAll();
        void save(Application user);
        Application get(Long id);
        void delete(Long id);

    }
