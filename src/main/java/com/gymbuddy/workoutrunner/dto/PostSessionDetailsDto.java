package com.gymbuddy.workoutrunner.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldDefaults;

/**
 * Request dto for new session details.
 */
@Value
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PostSessionDetailsDto {
    Long workoutId;
    String userId;
}
