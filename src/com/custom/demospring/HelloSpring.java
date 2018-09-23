package com.custom.demospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context2 =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context2.getBean("myExercise",Coach.class);
		//call methds
		//System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getFortuneService());
		//close contxt
		context.close();
		context2.close();
	}

}
