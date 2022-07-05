package com.tadi.user.service.service.impl;

import com.tadi.dto.user.CreateUserRequest;
import com.tadi.entity.User;
import com.tadi.repository.UserRepository;
import com.tadi.user.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean create(CreateUserRequest baseUserRequest) throws Exception {
        userRepository.save(this.convertToUser(baseUserRequest));
        return true;
    }

    public User convertToUser(CreateUserRequest createUserRequest) {
        User user = new User();
        BeanUtils.copyProperties(createUserRequest, user);
        return user;
    }

}
