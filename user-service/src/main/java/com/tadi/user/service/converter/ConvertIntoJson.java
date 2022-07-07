package com.tadi.user.service.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tadi.user.service.model.BaseKafkaModel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class ConvertIntoJson implements ConvertStrategy {

    @Override
    public String convert(BaseKafkaModel baseKafkaModel) {
        String result = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            result = mapper.writeValueAsString(baseKafkaModel.getMessage());
        } catch (JsonProcessingException e) {
            log.error("Error while converting, %s", e.getMessage());
        }
        return result;
    }
}
