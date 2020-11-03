package org.dlj.smartparking.rest.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class ResponseEntity<T> {

    private ResponseEntity() {
        data = new ArrayList<>();
    }

    private List<T> data;
    private Integer count;

    public static <T> ResponseEntity<T> of(final T... entities) {
        ResponseEntity<T> responseEntity = new ResponseEntity<>();
        responseEntity.data.addAll(Arrays.asList(entities));
        responseEntity.count = responseEntity.data.size();
        return responseEntity;
    }

    public static <T> ResponseEntity<T> of(final List<T> entities) {
        ResponseEntity<T> responseEntity = new ResponseEntity<>();
        responseEntity.data.addAll(entities);
        responseEntity.count = responseEntity.data.size();
        return responseEntity;
    }
}
