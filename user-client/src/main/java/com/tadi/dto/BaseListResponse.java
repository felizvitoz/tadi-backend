package com.tadi.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;

@Builder
@Getter
@Setter
public class BaseListResponse <T extends Collections> extends BaseResponse {

    private T contents;
}
