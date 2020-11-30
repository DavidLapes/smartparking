package org.dlj.smartparking.mapper;

import org.dlj.smartparking.model.Sensor;
import org.dlj.smartparking.rest.entity.SensorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = ParkingSpotMapper.class)
public interface SensorMapper {

    SensorDTO map(Sensor source);
    Sensor map(SensorDTO source);

    static SensorMapper getInstance() {
        return Mappers.getMapper(SensorMapper.class);
    }
}
