package com.tadi.dto.user;

import com.tadi.dto.BaseRequestModel;
import lombok.Data;

@Data
public class GetUserRequest extends BaseRequestModel {

    private String userName;
    private String email;

}
