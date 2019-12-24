package com.suntorycodetime.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		/* Load the spring config file. */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/* Retrieve bean from spring container. */
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		/* Call methods on the bean. */
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		/* CLose the context. */
		context.close();
		
	}

}
