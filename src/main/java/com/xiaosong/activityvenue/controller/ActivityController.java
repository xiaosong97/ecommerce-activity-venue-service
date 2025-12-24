package com.xiaosong.activityvenue.controller;

import com.xiaosong.activityvenue.model.ActivityResponse;
import com.xiaosong.activityvenue.service.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping("/{id}")
    public Mono<ActivityResponse> getActivity(@PathVariable Long id) {
        return activityService.getActivity(id);
    }
}
