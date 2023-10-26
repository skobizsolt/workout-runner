package com.gymbuddy.workoutrunner.persistence.query.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Dto class to receive recent sessions.
 */
@Value
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RecentSessionsDto {
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
