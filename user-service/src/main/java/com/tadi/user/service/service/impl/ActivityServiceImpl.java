package com.tadi.user.service.service.impl;

import com.tadi.dto.activity.CreateActivityRequest;
import com.tadi.user.service.converter.ConvertIntoJson;
import com.tadi.user.service.gateway.KafkaPublisherGateway;
import com.tadi.user.service.model.ActivityKafkaModel;
import com.tadi.user.service.model.BaseKafkaModel;
import com.tadi.user.service.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ActivityServiceImpl implements ActivityService {

    @Value(value = "${kafka.topic.activity}")
    private String kafkaTopicActivity;

    @Autowired
    private KafkaPublisherGateway kafkaPublisherGateway;

    @Override
    public boolean create(CreateActivityRequest createActivityRequest) throws Exception {
        BaseKafkaModel<ActivityKafkaModel> activityKafka = new BaseKafkaModel<>();
        activityKafka.setTopicName(kafkaTopicActivity);
        activityKafka.setMessage(this.buildActivityKafkaModel(createActivityRequest));
        kafkaPublisherGateway.publish(activityKafka, new ConvertIntoJson());
        return false;
    }

    private ActivityKafkaModel buildActivityKafkaModel(CreateActivityRequest createActivityRequest) {
        ActivityKafkaModel activityKafkaModel = ActivityKafkaModel.builder()
                .activityName(createActivityRequest.getType()).build();

        if (StringUtils.hasText(createActivityRequest.getExtras())) {
            List<ActivityKafkaModel.ActivityKafkaModelDetail> details = new ArrayList();
            activityKafkaModel.setDetails(details);
            Map<String, String> activityDetailsMap =
                    com.tadi.user.service.util.StringUtils.extractStringSeparatedValues(createActivityRequest.getExtras(), ";");
            activityDetailsMap.entrySet().stream().map(this::buildActivityKafkaDetailModel).forEach(details::add);
        }
        return activityKafkaModel;
    }

    private ActivityKafkaModel.ActivityKafkaModelDetail buildActivityKafkaDetailModel(Map.Entry<String,String> entry) {
        return ActivityKafkaModel.ActivityKafkaModelDetail.builder()
                .key(entry.getKey())
                .value(entry.getValue())
                .build();
    }
}
