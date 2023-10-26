package com.gymbuddy.workoutrunner.persistence.repository;

import com.gymbuddy.workoutrunner.persistence.domain.StepRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StepRecordRepository extends JpaRepository<StepRecord, Long> {
    List<StepRecord> findAllBySessionId(String sessionId);
}
