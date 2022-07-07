package com.tadi.user.service.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class StringUtils {

    public static Map<String, String> extractStringSeparatedValues(String valueToBeExtracted, String separator) {
        Map<String, String> result = new HashMap<>();
        try {
            if (!org.springframework.util.StringUtils.hasText(valueToBeExtracted)) {
                return result;
            }

            List<String> entries = Arrays.asList(valueToBeExtracted.split(separator));
            entries.stream().forEach(
                    entry -> {
                        List<String> splittedEntry = Arrays.asList(entry.split(","));
                        result.put(splittedEntry.get(0), splittedEntry.get(1));
                    }
            );
        } catch (Exception ex) {
            log.error("error while extracting string %s ", ex.getMessage());
        }
        return result;
    }
}
