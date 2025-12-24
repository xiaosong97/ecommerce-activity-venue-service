package com.xiaosong.activityvenue.service;

import com.xiaosong.activityvenue.model.ActivityResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class ActivityService {
    public Mono<ActivityResponse> getActivity(Long activityId) {
        ActivityResponse response = new ActivityResponse();
        response.setActivityId(activityId);
        response.setActivityName("Mock Activity");
        response.setSections(Map.of("mock", "data"));
        return Mono.just(response);
    }
}
