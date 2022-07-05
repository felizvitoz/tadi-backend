package com.tadi.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BaseSingleResponse<T> extends BaseResponse {

    private T content;

}
