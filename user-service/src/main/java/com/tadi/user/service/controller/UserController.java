package com.tadi.user.service.controller;

import com.tadi.user.service.model.response.UserResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${spring.datasource.url}")
    private String role;

    @GetMapping
    public UserResponse getUsers(@RequestParam String username, @RequestParam String email) {
        return UserResponse.builder().username(role).build();
    }
}
