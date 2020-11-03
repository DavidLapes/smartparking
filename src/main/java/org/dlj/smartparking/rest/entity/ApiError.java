package org.dlj.smartparking.rest.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ApiError {

    private List<String> errors;

    public ApiError(final List<String> errors) {
        this.errors = errors;
    }
}
