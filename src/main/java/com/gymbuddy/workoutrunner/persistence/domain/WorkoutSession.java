package com.gymbuddy.workoutrunner.persistence.domain;

import com.gymbuddy.workoutrunner.persistence.domain.enums.WorkoutSessionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

/**
 * Entity class for Step records.
 */
@Entity(name = "session")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class WorkoutSession {
    @Id
    @NotNull
    String sessionId;
    @NotNull
    Long workoutId;
    @NotNull
    String userId;
    @NotNull LocalDateTime createdAt;
    LocalDateTime completedAt;
    @Enumerated(value = EnumType.STRING)
    WorkoutSessionStatus status;
}
