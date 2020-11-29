package org.dlj.smartparking.rest.controller;

import org.dlj.smartparking.mapper.ParkingSpotMapper;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.entity.ParkingSpotSensorDTO;
import org.dlj.smartparking.rest.entity.ResponseEntity;
import org.dlj.smartparking.rest.service.ParkingSpotService;
import org.dlj.smartparking.rest.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final ParkingSpotService parkingSpotService;
    private final SensorService sensorService;
    private static final ParkingSpotMapper MAPPER = ParkingSpotMapper.getInstance();

    @Autowired
    public SensorController(
            final ParkingSpotService parkingSpotService,
            final SensorService sensorService
    ) {
        this.parkingSpotService = parkingSpotService;
        this.sensorService = sensorService;
    }

    @PostMapping("/update-availability")
    public ResponseEntity<ParkingSpotDTO> updateAvailability(@RequestBody ParkingSpotSensorDTO sensor) {
        sensorService.authenticate(sensor);
        final ParkingSpotDTO parkingSpot = MAPPER.map(sensor);
        final ParkingSpotDTO updatedSpot = parkingSpotService.updateAvailability(parkingSpot);
        return ResponseEntity.of(updatedSpot);
    }
}
