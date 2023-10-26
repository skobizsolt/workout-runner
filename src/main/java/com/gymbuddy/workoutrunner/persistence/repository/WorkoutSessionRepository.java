package com.gymbuddy.workoutrunner.persistence.repository;

import com.gymbuddy.workoutrunner.persistence.domain.WorkoutSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for {@link WorkoutSession}.
 */
@Repository
public interface WorkoutSessionRepository extends JpaRepository<WorkoutSession, String> {
}
