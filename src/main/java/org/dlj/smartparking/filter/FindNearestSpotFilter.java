package org.dlj.smartparking.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FindNearestSpotFilter {

    private Double latitude;
    private Double longitude;
    private Double radius;
    private Integer count;
}
