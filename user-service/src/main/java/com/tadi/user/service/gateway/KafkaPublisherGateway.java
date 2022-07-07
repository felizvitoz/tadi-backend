package com.tadi.user.service.gateway;

import com.tadi.user.service.converter.ConvertStrategy;
import com.tadi.user.service.model.BaseKafkaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaPublisherGateway {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publish(BaseKafkaModel baseKafkaModel, ConvertStrategy convertStrategy) throws Exception {
        String message = convertStrategy.convert(baseKafkaModel);
        this.kafkaTemplate.send(baseKafkaModel.getTopicName(), message);
    }
}
