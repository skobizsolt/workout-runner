package com.gymbuddy.workoutrunner.mapper;

import com.gymbuddy.workoutrunner.dto.PostRecordDto;
import com.gymbuddy.workoutrunner.model.StepRecordResponse;
import com.gymbuddy.workoutrunner.persistence.domain.StepRecord;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDateTime;
import java.util.List;

@Mapper(componentModel = "spring", imports = LocalDateTime.class)
public interface RunnerDtoMapper {
    @Named("toStepRecordResponse")
    StepRecordResponse toStepRecordResponse(StepRecord records);

    @IterableMapping(qualifiedByName = "toStepRecordResponse")
    List<StepRecordResponse> toStepRecordResponseList(List<StepRecord> records);

    @Mapping(target = "completedAt", expression = "java(LocalDateTime.now())")
    StepRecord toWorkoutRecord(PostRecordDto addRecord);
}
