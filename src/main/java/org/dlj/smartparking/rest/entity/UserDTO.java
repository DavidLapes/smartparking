package org.dlj.smartparking.rest.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String email;
    @JsonProperty(access = Access.WRITE_ONLY)
    private String password;
    private Timestamp timeCreated;
    private Timestamp timeUpdated;
    private Timestamp timeDeleted;
}
