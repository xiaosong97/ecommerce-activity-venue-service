package com.xiaosong.activityvenue.model;

import java.util.Map;

public class ActivityResponse {
    private Long activityId;
    private String activityName;

    // 聚合结果，占位
    private Map<String, Object> sections;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Map<String, Object> getSections() {
        return sections;
    }

    public void setSections(Map<String, Object> sections) {
        this.sections = sections;
    }
}
