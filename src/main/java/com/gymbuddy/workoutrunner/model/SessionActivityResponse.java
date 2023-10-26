package com.gymbuddy.workoutrunner.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * API response for user activity in the past.
 */
@Value
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SessionActivityResponse {
    String sessionId;
    Long workoutId;
    String workoutName;
    String difficulty;
    String category;
    LocalDateTime startedAt;
    LocalDateTime completedAt;
    String completionStatus;
    BigDecimal timeToComplete;
    BigDecimal completedInSeconds;
}
