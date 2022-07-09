package com.tadi.reward.service.inbound;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaTopicListener {

    @KafkaListener(topics = "${kafka.topic.activity}", groupId = "${kafka.listener.groupId}")
    public void listenGroupFoo(String message) {
       log.info("Received Message in group foo: " + message);
    }
}
