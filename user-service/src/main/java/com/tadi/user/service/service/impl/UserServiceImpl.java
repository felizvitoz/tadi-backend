package com.tadi.user.service.service.impl;

import com.tadi.dto.user.CreateUserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl {

    public boolean create(CreateUserRequest baseUserRequest) throws Exception {
        return true;
    }
}
