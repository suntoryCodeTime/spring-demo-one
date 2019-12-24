package com.suntorycodetime.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// Init
	public void doStartUp() {
		System.out.println("Starting Up Track Coach"); 
	}
	
	// Destroy
	public void doCleanUp() {
		System.out.println("Cleaning Up Track Coach");
	}

}
