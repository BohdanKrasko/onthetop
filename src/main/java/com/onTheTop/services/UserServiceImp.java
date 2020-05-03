package com.onTheTop.services;

import com.onTheTop.api.rest.dto.UserRequest;
import com.onTheTop.api.rest.dto.UserResponse;
import com.onTheTop.domain.repositories.UserRepository;
import com.onTheTop.exceptions.NotFoundExeption;
import com.onTheTop.mapping.UserMapper;
import com.onTheTop.mapping.UserMapperImpl;
import com.onTheTop.services.specification.UserGetAllSpecification;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserServiceImp implements UserService {

    UserRepository userRepository;
    UserMapper userMapper;
    UserGetAllSpecification userGetAllSpecification;

    @Autowired
    public UserServiceImp(UserRepository userRepository, UserGetAllSpecification userGetAllSpecification) {
        this.userRepository = userRepository;
        this.userGetAllSpecification = userGetAllSpecification;
        this.userMapper = new UserMapperImpl();
    }

    @Override
    public UserResponse addUser(UserRequest request) {
        return userMapper.toResponse(userRepository.save(userMapper.toEntity(request)));
    }

    @Override
    public UserResponse getUser(Long id) {
        return userRepository.findById(id).map(userMapper::toResponse).orElseThrow(NotFoundExeption::new);
    }

    @Override
    public Page<UserResponse> getAllUser() {

        return userRepository.findAll(userGetAllSpecification.getSpecification(), Pageable.unpaged()).map(userMapper::toResponse);
    }

    @Override
    public UserResponse updateUser(UserRequest request, Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
