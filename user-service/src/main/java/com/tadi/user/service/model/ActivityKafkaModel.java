package com.tadi.user.service.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ActivityKafkaModel {

    private String activityName;
    private List<ActivityKafkaModelDetail> details;

    @Data
    @Builder
    public static class ActivityKafkaModelDetail {
        private String key;
        private String value;
    }
}

