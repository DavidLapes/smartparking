package org.dlj.smartparking.repository;

import org.dlj.smartparking.filter.FindNearestSpotFilter;
import org.dlj.smartparking.model.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Long> {

    @Query("SELECT t FROM ParkingSpot t") //TODO nearest available parking spots algorithm
    List<ParkingSpot> findNearest(FindNearestSpotFilter filter);

    @Query("UPDATE ParkingSpot t SET t.available = ?2 WHERE t.uuid = ?1")
    ParkingSpot updateAvailability(String uuid, Boolean available);
}
