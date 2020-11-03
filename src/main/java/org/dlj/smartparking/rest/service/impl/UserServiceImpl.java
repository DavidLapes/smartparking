package org.dlj.smartparking.rest.service.impl;

import org.dlj.smartparking.repository.UserRepository;
import org.dlj.smartparking.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(final UserRepository repository) {
        this.repository = repository;
    }
}
