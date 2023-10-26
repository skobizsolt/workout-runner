package com.gymbuddy.workoutrunner.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Model for StepRecord response.
 */
@Value
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StepRecordResponse {
    Long stepId;
    LocalDateTime completedAt;
    BigDecimal duration;
}
