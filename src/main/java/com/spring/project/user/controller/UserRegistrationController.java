package com.spring.project.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.user.request.UserRegistrationRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/user")
public class UserRegistrationController {

    public UserRegistrationController() {
    }

    @PostMapping(path = "/register")
    public ResponseEntity<?> register(@Valid @RequestBody UserRegistrationRequest registrationRequest) {
        return ResponseEntity.ok(null);
    }
}
