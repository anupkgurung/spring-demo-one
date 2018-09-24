package com.custom.demospring;

public class SportExercise implements Coach{
	
	private FortuneService theFortuneService;
	
	public SportExercise(FortuneService FortuneService) {
		theFortuneService = FortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "this is excercise for basket ball";
	}
	
	public String getService() {
		return "i ma from sport service";//theFortuneService.getFortuneService();
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return null;
	}
}
