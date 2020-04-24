package com.onTheTop.api.rest.dto;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {

    String email;
    String password;
    String name;
    String lastName;

}
