package com.sha.deviceseller.service;

import com.sha.deviceseller.model.Role;
import com.sha.deviceseller.model.User;

import java.util.Optional;

public interface UserService {


    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
