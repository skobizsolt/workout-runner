package com.gymbuddy.workoutrunner.controller;

import com.gymbuddy.workoutrunner.dto.PostSessionDetailsDto;
import com.gymbuddy.workoutrunner.model.SessionStartedResponse;
import com.gymbuddy.workoutrunner.service.SessionService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workout-runner")
@RequiredArgsConstructor
@Slf4j
public class SessionController {

    private final SessionService sessionService;

    @PostMapping("/new-session")
    public ResponseEntity<SessionStartedResponse> startSession(
            @RequestHeader("Authorization") final String token,
            @RequestBody @NotNull @Valid final PostSessionDetailsDto details) {
        log.info("Rest endpoint::recordStep invoked. Parameters: {}", details);
        final SessionStartedResponse sessionId = sessionService.startSession(details);
        return ResponseEntity.ok(sessionId);
    }

    @PutMapping("/finish")
    public ResponseEntity<Void> finishTraining(
     @RequestHeader("Authorization") final String token,
     @RequestParam final String sessionId) {
        log.info("Rest endpoint::finishTraining invoked. Session: {}", sessionId);
        sessionService.finishSession(sessionId);
        return ResponseEntity.ok().build();
    }
}
