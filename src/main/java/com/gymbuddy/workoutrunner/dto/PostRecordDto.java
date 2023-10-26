package com.gymbuddy.workoutrunner.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

/**
 * Dto class for posting a new record.
 */
@Value
@Builder
@FieldDefaults(level = AccessLevel.PACKAGE)
public class PostRecordDto {
    Long workoutId;
    Long stepId;
    String sessionId;
    BigDecimal duration;
}
