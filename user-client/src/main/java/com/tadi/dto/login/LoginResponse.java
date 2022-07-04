package com.tadi.dto.login;

import lombok.Data;

import java.util.List;

@Data
public class LoginResponse {

    private String userId;
    private String userName;
    private List<RoleResponse> roles;
}
