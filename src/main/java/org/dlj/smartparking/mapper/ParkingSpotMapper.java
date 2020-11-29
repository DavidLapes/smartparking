package org.dlj.smartparking.mapper;

import org.dlj.smartparking.model.ParkingSpot;
import org.dlj.smartparking.rest.entity.ParkingSpotDTO;
import org.dlj.smartparking.rest.entity.ParkingSpotSensorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ParkingSpotMapper {

    ParkingSpotDTO map(ParkingSpot source);
    ParkingSpot map(ParkingSpotDTO source);

    //TODO check if this works
    @Mapping(target = "longitude", ignore = true)
    @Mapping(target = "latitude", ignore = true)
    @Mapping(target = "id", ignore = true)
    ParkingSpotDTO map(ParkingSpotSensorDTO source);

    List<ParkingSpotDTO> mapToDTOs(List<ParkingSpot> source);
    List<ParkingSpot> mapFromDTOs(List<ParkingSpotDTO> source);

    static ParkingSpotMapper getInstance() {
        return Mappers.getMapper(ParkingSpotMapper.class);
    }
}
