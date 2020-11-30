package org.dlj.smartparking.rest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpotDTO {

    private Long id;
    private String uuid;
    private Double latitude;
    private Double longitude;
    private Boolean available;
    private String sensorUuid;
}
