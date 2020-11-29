package org.dlj.smartparking.rest.controller;

import org.dlj.smartparking.filter.FindNearestSpotFilter;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.entity.ResponseEntity;
import org.dlj.smartparking.rest.service.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/parking-spots")
public class ParkingSpotController {

    private final ParkingSpotService service;

    @Autowired
    public ParkingSpotController(final ParkingSpotService service) {
        this.service = service;
    }

    @GetMapping("/nearest")
    public ResponseEntity<ParkingSpotDTO> getNearest(
            @RequestParam final Double latitude,
            @RequestParam final Double longitude,
            @RequestParam final Double radius,
            @RequestParam final Integer count
    ) {
        final FindNearestSpotFilter filter =
                new FindNearestSpotFilter(latitude, longitude, radius, count);

        final List<ParkingSpotDTO> result = service.findNearest(filter);
        return ResponseEntity.of(result);
    }
}

