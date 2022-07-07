package com.tadi.user.service.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseKafkaModel<T> implements Serializable {

    private String topicName;
    private T message;
    // add other
}
