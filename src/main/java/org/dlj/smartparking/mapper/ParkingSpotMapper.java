package org.dlj.smartparking.mapper;

import org.dlj.smartparking.model.ParkingSpot;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ParkingSpotMapper {

    @Mapping(source = "sensor.uuid", target = "sensorUuid")
    ParkingSpotDTO map(ParkingSpot source);
    @Mapping(source = "sensorUuid", target = "sensor.uuid")
    ParkingSpot map(ParkingSpotDTO source);

    List<ParkingSpotDTO> mapToDTOs(List<ParkingSpot> source);

    static ParkingSpotMapper getInstance() {
        return Mappers.getMapper(ParkingSpotMapper.class);
    }
}
