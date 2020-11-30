package org.dlj.smartparking.rest.service;

import org.dlj.smartparking.rest.entity.SensorParkingSpotDTO;

public interface SensorService {

    void authenticate(SensorParkingSpotDTO sensor);
}
