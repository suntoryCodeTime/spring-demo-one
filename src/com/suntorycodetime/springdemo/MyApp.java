package com.suntorycodetime.springdemo;

import com.suntorycodetime.springdemo.impl.TrackCoach;

public class MyApp {

	public static void main(String[] args) {
		
		// Create the Object
		Coach theCoach = new TrackCoach();
		
		// Use the Object
		System.out.println(theCoach.getDailyWorkout());
	}

}
