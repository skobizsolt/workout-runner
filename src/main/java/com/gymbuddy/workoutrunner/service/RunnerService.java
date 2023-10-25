package com.gymbuddy.workoutrunner.service;

import com.gymbuddy.workoutrunner.dto.PostRecordDto;
import com.gymbuddy.workoutrunner.model.StepRecordResponse;
import com.gymbuddy.workoutrunner.persistence.query.dto.RecentSessionsDto;

import java.util.List;

/**
 * Interface for workout runner operations.
 */
public interface RunnerService {

    List<StepRecordResponse> getRecordsForSession(String sessionId);

    void recordStep(PostRecordDto addRecord);

    List<RecentSessionsDto> getActivityForUser(String userId);
}
