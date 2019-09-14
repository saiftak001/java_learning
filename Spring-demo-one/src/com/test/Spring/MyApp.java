package com.test.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		CricketCoach alphaCoach = context.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(theCoach.getCoachingDetails());
		System.out.println(theCoach.getCoachHealthDetails());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());

		System.out.println("theCoach location " + theCoach);
		System.out.println("alphaCoach location " + alphaCoach);

		context.close();
	}
}
