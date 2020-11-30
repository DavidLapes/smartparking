package org.dlj.smartparking.rest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SensorParkingSpotDTO {

    private String sensorUuid;
    private String password;
    private String parkingSpotUuid;
    private Boolean available;
}
