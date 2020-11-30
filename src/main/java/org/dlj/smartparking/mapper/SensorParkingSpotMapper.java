package org.dlj.smartparking.mapper;

import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.entity.SensorParkingSpotDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SensorParkingSpotMapper {

    @Mapping(source = "parkingSpotUuid", target = "uuid")
    ParkingSpotDTO map(SensorParkingSpotDTO source);

    static SensorParkingSpotMapper getInstance() {
        return Mappers.getMapper(SensorParkingSpotMapper.class);
    }
}
