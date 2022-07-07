package com.tadi.user.service.service;

import com.tadi.dto.activity.CreateActivityRequest;

public interface ActivityService {

    boolean create(CreateActivityRequest createActivityRequest) throws Exception;

}