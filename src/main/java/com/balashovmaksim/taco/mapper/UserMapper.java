package com.balashovmaksim.taco.mapper;

import com.balashovmaksim.taco.dto.UserCreateDto;
import com.balashovmaksim.taco.dto.UserReadDto;
import com.balashovmaksim.taco.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "password", ignore = true)
    User toUser(UserCreateDto userCreateDto);

    UserReadDto toUserReadDto(User user);
}