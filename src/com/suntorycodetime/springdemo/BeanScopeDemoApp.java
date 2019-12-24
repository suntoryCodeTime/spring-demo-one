package com.suntorycodetime.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean res = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + res);
		System.out.println("\nMem Loc for theCoach: " + theCoach);
		System.out.println("\nMem Loc for alphaCoach: " + alphaCoach);
		
		context.close();
	}

}
