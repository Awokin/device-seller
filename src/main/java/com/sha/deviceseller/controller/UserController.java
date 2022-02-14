package com.sha.deviceseller.controller;

import com.sha.deviceseller.model.Role;
import com.sha.deviceseller.security.UserPrincipal;
import com.sha.deviceseller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("change/{role}") //api/user/change/{role}
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role)
    {

        userService.changeRole(role, userPrincipal.getUsername());

        return ResponseEntity.ok(true);
    }

}
