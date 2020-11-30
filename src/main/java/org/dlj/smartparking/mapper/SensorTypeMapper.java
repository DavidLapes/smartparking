package org.dlj.smartparking.mapper;

import org.dlj.smartparking.model.SensorType;
import org.dlj.smartparking.rest.entity.SensorTypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SensorTypeMapper {

    SensorTypeDTO map(SensorType source);
    SensorType map(SensorTypeDTO source);

    static SensorTypeMapper getInstance() {
        return Mappers.getMapper(SensorTypeMapper.class);
    }
}
