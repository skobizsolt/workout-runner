package com.gymbuddy.workoutrunner.persistence.query;

import com.gymbuddy.workoutrunner.persistence.query.dto.RecentSessionsDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * MyBatis mapper for Workout runner related queries.
 */
@Mapper
@Component
public interface WorkoutRunnerQueryMapper {

    List<RecentSessionsDto> getSessionActivity(@Param("userId") String userId);
}
