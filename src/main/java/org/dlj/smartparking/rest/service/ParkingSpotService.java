package org.dlj.smartparking.rest.service;

import org.dlj.smartparking.filter.FindNearestSpotFilter;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;

import java.util.List;

public interface ParkingSpotService {

    ParkingSpotDTO updateAvailability(ParkingSpotDTO uuid);
    List<ParkingSpotDTO> findNearest(FindNearestSpotFilter filter);
}
