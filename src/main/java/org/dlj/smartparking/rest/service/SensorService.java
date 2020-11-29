package org.dlj.smartparking.rest.service;

import org.dlj.smartparking.rest.entity.ParkingSpotSensorDTO;

public interface SensorService {

    void authenticate(ParkingSpotSensorDTO sensor);
}
