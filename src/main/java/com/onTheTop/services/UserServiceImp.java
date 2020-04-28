package com.onTheTop.services;

import com.onTheTop.api.rest.dto.UserRequest;
import com.onTheTop.api.rest.dto.UserResponse;
import com.onTheTop.domain.repositories.UserRepository;
import com.onTheTop.mapping.UserMapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserServiceImp implements UserService {

    UserRepository userRepository;
    UserMapper userMapper;

    @Autowired
    public UserServiceImp(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponse addUser(UserRequest request) {
        return null;
    }

    @Override
    public UserResponse getUser(Long id) {
        return null;
    }

    @Override
    public UserResponse getAllUser() {
        return null;
    }

    @Override
    public UserResponse updateUser(UserRequest request, Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
