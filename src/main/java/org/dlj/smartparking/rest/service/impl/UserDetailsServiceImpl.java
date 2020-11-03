package org.dlj.smartparking.rest.service.impl;

import org.dlj.smartparking.repository.UserRepository;
import org.dlj.smartparking.security.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository repository;

    @Autowired
    public UserDetailsServiceImpl(final UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public SecurityUser loadUserByUsername(final String email) throws UsernameNotFoundException {
        final org.dlj.smartparking.model.User model = repository.findByEmail(email);
        if( model == null ) {
            throw new UsernameNotFoundException("User - {" + email + "} was not found in the database");
        }

        final SecurityUser securityUser = new SecurityUser(model.getEmail(), model.getPassword(), Collections.emptyList());
        securityUser.setId(model.getId());

        return securityUser;
    }
}
