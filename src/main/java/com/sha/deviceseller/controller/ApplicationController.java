package com.sha.deviceseller.controller;

import com.sha.deviceseller.model.Application;
import com.sha.deviceseller.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@RestController
@RequestMapping("/api/")
@CrossOrigin
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    // URI - /api/users
    @GetMapping(value = "users")
    public ResponseEntity<List<Application>> istAllUsers() {
        List<Application> users = this.applicationService.listAll();
        return new ResponseEntity<List<Application>>(users,
                HttpStatus.OK);
    }

    // URI - /api/user/id/1
    @GetMapping("user/id/{id}")
    public ResponseEntity<Application> getUserById(
            @PathVariable(name = "id") final Long userId) {
        try {
            final Application user = this.applicationService.
                    get(userId);
            return new ResponseEntity<Application>
                    (user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Application>
                    (HttpStatus.NOT_FOUND);
        }
    }

    // URI - /api/user/save
    @PostMapping(value = "user/save")
    public ResponseEntity<Application> save(@RequestBody Application
                                                user) {
        this.applicationService.save(user);
        return new ResponseEntity<Application>(user,
                HttpStatus.CREATED);
    }

    // URI - /api/user/delete/id/1
    @DeleteMapping("user/delete/id/{id}")
    public ResponseEntity<Application> delete(@PathVariable(name = "id") final Long userId) {

        this.applicationService.delete(userId);
        return new ResponseEntity<Application>(HttpStatus.NO_CONTENT);
    }

}
