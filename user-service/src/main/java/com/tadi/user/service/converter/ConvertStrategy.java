package com.tadi.user.service.converter;

import com.tadi.user.service.model.BaseKafkaModel;

public interface ConvertStrategy {

    public String convert(BaseKafkaModel baseKafkaModel);
}
