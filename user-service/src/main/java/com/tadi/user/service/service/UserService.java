package com.tadi.user.service.service;

import com.tadi.dto.user.CreateUserRequest;

public interface UserService {

    boolean create(CreateUserRequest baseUserRequest) throws Exception;

}
