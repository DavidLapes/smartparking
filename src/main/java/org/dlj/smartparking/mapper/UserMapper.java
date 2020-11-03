package org.dlj.smartparking.mapper;

import org.dlj.smartparking.model.User;
import org.dlj.smartparking.rest.entity.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    @Mapping(target = "password", ignore = true)
    UserDTO map(User source);

    User map(UserDTO source);

    static UserMapper getInstance() {
        return Mappers.getMapper(UserMapper.class);
    }
}
