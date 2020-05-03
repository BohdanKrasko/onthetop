package com.onTheTop.services;

import com.onTheTop.api.rest.dto.UserRequest;
import com.onTheTop.api.rest.dto.UserResponse;
import org.springframework.data.domain.Page;

public interface UserService {

    UserResponse addUser(UserRequest request);

    UserResponse getUser(Long id);

    Page<UserResponse> getAllUser();

    UserResponse updateUser(UserRequest request, Long id);

    void deleteUser(Long id);

}
