package com.onTheTop.mapping;

import com.onTheTop.api.rest.dto.UserRequest;
import com.onTheTop.api.rest.dto.UserResponse;
import com.onTheTop.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {

    UserResponse toResponse (User user);

    @Mapping(target = "id", ignore = true)
    User toEntity (UserRequest request);

    @Mapping(target = "id", ignore = true)
    User updateEntity(@MappingTarget User user, UserRequest request); // than add string passwordEncoded
}
