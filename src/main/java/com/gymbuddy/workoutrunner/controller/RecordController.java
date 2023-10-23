package com.gymbuddy.workoutrunner.controller;

import com.gymbuddy.workoutrunner.dto.PostRecordDto;
import com.gymbuddy.workoutrunner.model.StepRecordResponse;
import com.gymbuddy.workoutrunner.service.RunnerService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for Workout runner REST APIs.
 */
@RestController
@RequestMapping("/workout-runner")
@RequiredArgsConstructor
@Slf4j
public class RecordController {

    private final RunnerService simulationService;

    @GetMapping("/records")
    public ResponseEntity<List<StepRecordResponse>> getRecords(
            @RequestHeader("Authorization") final String token,
            @RequestParam @NotNull @Valid final String sessionId) {
        log.info("Rest endpoint::getRecords invoked. " +
                "Parameters: sessionId {}", sessionId);
        List<StepRecordResponse> response = simulationService.getRecordsForSession(sessionId);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<Void> recordStep(
            @RequestHeader("Authorization") final String token,
            @RequestBody @NotNull @Valid final PostRecordDto addRecord) {
        log.info("Rest endpoint::recordStep invoked. Parameters: {}", addRecord);
        simulationService.recordStep(addRecord);
        return ResponseEntity.ok().build();
    }
}
