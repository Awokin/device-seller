package com.sha.deviceseller.service;

import com.sha.deviceseller.model.User;

public interface AuthenticationService {


    User signInAndReturnJWT(User signInRequest);
}
