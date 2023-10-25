package com.gymbuddy.workoutrunner.mapper;

import com.gymbuddy.workoutrunner.model.SessionActivityResponse;
import com.gymbuddy.workoutrunner.persistence.query.dto.RecentSessionsDto;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Mapstruct mapper for dto - api mapping.
 */
@Mapper(componentModel = "spring", imports = LocalDateTime.class)
public interface RunnerModelMapper {
    @Named("toSessionActivityResponse")
    SessionActivityResponse toSessionActivityResponse(RecentSessionsDto recentSession);

    @IterableMapping(qualifiedByName = "toSessionActivityResponse")
    List<SessionActivityResponse> toSessionActivityResponseList(List<RecentSessionsDto> recentSessions);
}
