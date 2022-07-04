package com.tadi.user.service.controller;

import com.tadi.dto.user.UserResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${spring.datasource.url}")
    private String prop;

    @GetMapping
    public UserResponse getUsers(@RequestParam(required = false) String username, @RequestParam(required = false) String email) {
        return UserResponse.builder().username(prop).build();
    }

    @PostMapping
    public UserResponse createUser(@RequestParam String username, @RequestParam String email) {
        return UserResponse.builder().username("").build();
    }
}
