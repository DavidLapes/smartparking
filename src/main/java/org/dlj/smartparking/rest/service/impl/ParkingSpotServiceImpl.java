package org.dlj.smartparking.rest.service.impl;

import org.dlj.smartparking.filter.FindNearestSpotFilter;
import org.dlj.smartparking.mapper.ParkingSpotMapper;
import org.dlj.smartparking.model.ParkingSpot;
import org.dlj.smartparking.repository.ParkingSpotRepository;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.service.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {

    private final ParkingSpotRepository repository;
    private static final ParkingSpotMapper MAPPER = ParkingSpotMapper.getInstance();

    @Autowired
    public ParkingSpotServiceImpl(final ParkingSpotRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ParkingSpotDTO> findNearest(final FindNearestSpotFilter filter) {
        final List<ParkingSpot> model = repository.findNearest(filter);
        return MAPPER.mapToDTOs(model);
    }

    @Override
    public ParkingSpotDTO updateAvailability(final ParkingSpotDTO parkingSpot) {
        final ParkingSpot model =
                repository.updateAvailability(parkingSpot.getUuid(), parkingSpot.getAvailable());

        return MAPPER.map(model);
    }
}
