package com.gymbuddy.workoutrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.gymbuddy")
public class GymbuddyWorkoutRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymbuddyWorkoutRunnerApplication.class, args);
	}

}
