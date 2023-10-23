package com.gymbuddy.workoutrunner.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldDefaults;

@Value
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SessionStartedResponse {
    String sessionId;
}
