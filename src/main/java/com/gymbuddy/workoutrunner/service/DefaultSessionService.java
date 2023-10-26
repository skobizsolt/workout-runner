package com.gymbuddy.workoutrunner.service;

import com.gymbuddy.workoutrunner.dto.PostSessionDetailsDto;
import com.gymbuddy.workoutrunner.exception.Errors;
import com.gymbuddy.workoutrunner.exception.ServiceExpection;
import com.gymbuddy.workoutrunner.mapper.SessionDtoMapper;
import com.gymbuddy.workoutrunner.model.SessionStartedResponse;
import com.gymbuddy.workoutrunner.persistence.domain.WorkoutSession;
import com.gymbuddy.workoutrunner.persistence.repository.WorkoutSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.gymbuddy.workoutrunner.persistence.domain.enums.WorkoutSessionStatus.COMPLETED;

/**
 * Default implementation of {@link SessionService}.
 */
@Service
@RequiredArgsConstructor
public class DefaultSessionService implements SessionService {

    private final SessionDtoMapper sessionDtoMapper;
    private final WorkoutSessionRepository sessionRepository;

    @Override
    public SessionStartedResponse startSession(PostSessionDetailsDto details) {
        final WorkoutSession session = sessionDtoMapper.toWorkoutSession(details);
        sessionRepository.save(session);
        return SessionStartedResponse.builder()
                .sessionId(session.getSessionId()).build();
    }

    @Override
    public void finishSession(String sessionId) {
        final WorkoutSession session = sessionRepository
                .findById(sessionId)
                .orElseThrow(() -> new ServiceExpection(Errors.SESSION_NOT_FOUND));
        sessionDtoMapper.finishSession(session, COMPLETED);
        sessionRepository.save(session);
    }
}
