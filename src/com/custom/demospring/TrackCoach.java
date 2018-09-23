package com.custom.demospring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach () {
		//no argument constructor for MyApp as it is invoking default constructor. 
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getFortuneService() {
		
		return "i am from tack coach" + fortuneService.getFortuneService();
	}

}
