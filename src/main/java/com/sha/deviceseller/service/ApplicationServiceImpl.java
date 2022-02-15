package com.sha.deviceseller.service;

import com.sha.deviceseller.model.Application;
import com.sha.deviceseller.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

    @Service
    @Transactional
    public class ApplicationServiceImpl implements ApplicationService {

        @Autowired
        private ApplicationRepository applicationRepository;

        @Override
        public List<Application> listAll() {
            return applicationRepository.findAll();
        }

        @Override
        public void save(Application user) {

            applicationRepository.save(user);
        }

        @Override
        public Application get(Long id) {
            return applicationRepository.findById(id).get();
        }

        @Override
        public void delete(Long id) {
            applicationRepository.deleteById(id);
        }

    }
