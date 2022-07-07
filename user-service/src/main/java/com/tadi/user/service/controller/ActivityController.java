package com.tadi.user.service.controller;

import com.tadi.dto.BaseSingleResponse;
import com.tadi.dto.activity.CreateActivityRequest;
import com.tadi.user.service.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities")
@Slf4j
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    // this activity class should not be publicly accessible, must be accessible from internal network, don't add this to the api
    // call this first before processing the main logic
    @PostMapping
    public BaseSingleResponse<Boolean> createUser(@RequestBody CreateActivityRequest createActivityRequest) throws Exception {
        try {
            boolean success = this.activityService.create(createActivityRequest);
            return BaseSingleResponse.<Boolean>builder().content(success).build();
        } catch (Exception ex) {
            // do not logging password
            log.error(ex.getMessage());
            throw ex;
        }
    }

}
