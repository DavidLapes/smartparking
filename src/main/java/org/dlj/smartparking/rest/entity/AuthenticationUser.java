package org.dlj.smartparking.rest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationUser {

    private String email;
    private String password;
}
