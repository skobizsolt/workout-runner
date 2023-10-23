package com.gymbuddy.workoutrunner.mapper;

import com.gymbuddy.workoutrunner.dto.PostSessionDetailsDto;
import com.gymbuddy.workoutrunner.persistence.domain.WorkoutSession;
import com.gymbuddy.workoutrunner.persistence.domain.enums.WorkoutSessionStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Mapper class for Workout runner session management.
 */
@Mapper(
        componentModel = "spring",
        imports = {
                LocalDateTime.class,
                UUID.class,
                WorkoutSessionStatus.class
        }
)
public interface SessionDtoMapper {
    @Mapping(target = "sessionId", expression = "java(UUID.randomUUID().toString())")
    @Mapping(target = "createdAt", expression = "java(LocalDateTime.now())")
    @Mapping(target = "status", expression = "java(WorkoutSessionStatus.SESSION_STARTED)")
    WorkoutSession toWorkoutSession(PostSessionDetailsDto details);
}
