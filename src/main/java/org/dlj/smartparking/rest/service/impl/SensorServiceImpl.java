package org.dlj.smartparking.rest.service.impl;

import org.dlj.smartparking.repository.SensorRepository;
import org.dlj.smartparking.rest.entity.SensorParkingSpotDTO;
import org.dlj.smartparking.rest.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorServiceImpl implements SensorService {

    private final SensorRepository repository;

    @Autowired
    public SensorServiceImpl(final SensorRepository repository) {
        this.repository = repository;
    }

    @Override
    public void authenticate(final SensorParkingSpotDTO sensor) {
        repository.findByCredentials(sensor.getSensorUuid(), sensor.getPassword());
    }
}
