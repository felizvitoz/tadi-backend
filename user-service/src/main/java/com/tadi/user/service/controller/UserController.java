package com.tadi.user.service.controller;

import com.tadi.dto.BaseSingleResponse;
import com.tadi.dto.user.CreateUserRequest;
import com.tadi.user.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public BaseSingleResponse getUsers(@RequestParam(required = false) String username, @RequestParam(required = false) String email) {
        return BaseSingleResponse.builder().build();
    }

    @PostMapping
    public BaseSingleResponse<Boolean> createUser(@RequestBody CreateUserRequest createUserRequest) throws Exception {
        try {
            boolean success = userService.create(createUserRequest);
            return BaseSingleResponse.<Boolean>builder().content(success).build();
        } catch (Exception ex) {
            // do not logging password
            log.error(ex.getMessage());
            throw ex;
        }
    }
}
