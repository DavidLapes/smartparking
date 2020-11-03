package org.dlj.smartparking.rest.controller;

import org.dlj.smartparking.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private final UserService service;

    @Autowired
    public UserController(final UserService service) {
        this.service = service;
    }
}
