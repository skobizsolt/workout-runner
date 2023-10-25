package com.gymbuddy.workoutrunner.service;

import com.gymbuddy.workoutrunner.dto.PostRecordDto;
import com.gymbuddy.workoutrunner.mapper.RunnerDtoMapper;
import com.gymbuddy.workoutrunner.model.StepRecordResponse;
import com.gymbuddy.workoutrunner.persistence.domain.StepRecord;
import com.gymbuddy.workoutrunner.persistence.query.WorkoutRunnerQueryMapper;
import com.gymbuddy.workoutrunner.persistence.query.dto.RecentSessionsDto;
import com.gymbuddy.workoutrunner.persistence.repository.StepRecordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Default implementation of {@link RunnerService}.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class DefaultRunnerService implements RunnerService {

    private final RunnerDtoMapper runnerMapper;
    private final StepRecordRepository stepRecordRepository;
    private final WorkoutRunnerQueryMapper workoutRunnerQueryMapper;

    @Override
    public List<StepRecordResponse> getRecordsForSession(final String sessionId) {
        List<StepRecord> records = stepRecordRepository.findAllBySessionId(sessionId);
        return runnerMapper.toStepRecordResponseList(records);
    }

    @Override
    public void recordStep(final PostRecordDto addRecord) {
        final StepRecord newRecord = runnerMapper.toWorkoutRecord(addRecord);
        stepRecordRepository.save(newRecord);
        log.info("New record entry saved!");
    }

    @Override
    public List<RecentSessionsDto> getActivityForUser(String userId) {
        return workoutRunnerQueryMapper.getSessionActivity(userId);
    }
}
