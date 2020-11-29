package org.dlj.smartparking.rest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpotSensorDTO {

    private String uuid;
    private String password;
    private Boolean available;
}
