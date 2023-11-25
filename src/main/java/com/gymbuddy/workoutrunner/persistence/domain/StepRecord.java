package com.gymbuddy.workoutrunner.persistence.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity class for Step records.
 */
@Entity(name = "step_record")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class StepRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long recordId;
    @NotNull
    String sessionId;
    @NotNull
    Long stepId;
    @NotNull
    LocalDateTime completedAt;
    @NotNull
    BigDecimal duration;
}
