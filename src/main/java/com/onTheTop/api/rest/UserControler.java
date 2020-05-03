package com.onTheTop.api.rest;

import com.onTheTop.api.rest.dto.UserRequest;
import com.onTheTop.api.rest.dto.UserResponse;
import com.onTheTop.services.UserServiceImp;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserControler {

    UserServiceImp userServiceImp;

    @Autowired
    public UserControler(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @PostMapping("/add")
    public UserResponse addUser(@RequestBody UserRequest request) {
        return userServiceImp.addUser(request);
    }

    @GetMapping("allusers")
    public Page<UserResponse> getAllUser() {
        return userServiceImp.getAllUser();
    }
}
