package com.tadi.dto.user;

import com.tadi.dto.BaseResponseModel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse extends BaseResponseModel {

    private String username;
    private String email;
}
