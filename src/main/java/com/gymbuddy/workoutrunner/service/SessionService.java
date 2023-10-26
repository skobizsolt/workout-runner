package com.gymbuddy.workoutrunner.service;

import com.gymbuddy.workoutrunner.dto.PostSessionDetailsDto;
import com.gymbuddy.workoutrunner.model.SessionStartedResponse;

/**
 * Interface class for session control.
 */
public interface SessionService {
    SessionStartedResponse startSession(PostSessionDetailsDto details);

    void finishSession(String sessionId);
}
