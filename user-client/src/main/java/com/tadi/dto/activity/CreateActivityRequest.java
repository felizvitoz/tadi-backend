package com.tadi.dto.activity;

import com.tadi.dto.BaseRequestModel;
import lombok.Data;

@Data
public class CreateActivityRequest extends BaseRequestModel {

    private String referenceId;
    private String type;
    // semicolon separated
    private String extras;
}
