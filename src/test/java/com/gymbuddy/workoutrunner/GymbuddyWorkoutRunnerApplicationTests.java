package com.gymbuddy.workoutrunner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GymbuddyWorkoutRunnerApplicationTests {

	private final ApplicationContext context;

	GymbuddyWorkoutRunnerApplicationTests(ApplicationContext context) {
		this.context = context;
	}

	@Test
	void contextLoads() {
		assertEquals("gymbuddy-workout-runner", context.getId());
	}

}
