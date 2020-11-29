package org.dlj.smartparking.rest.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SensorDTO {

    private String id;
    private String uuid;
    private String password;
    private SensorTypeDTO type;
    private List<ParkingSpotDTO> parkingSpots;
}
