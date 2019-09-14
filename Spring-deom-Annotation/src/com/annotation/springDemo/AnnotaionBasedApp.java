package com.annotation.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionBasedApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(tennisCoach.getCoachDetails());
		
		System.out.println(tennisCoach.getFortuneDetails());
		
		System.out.println(tennisCoach.getDataSource());
		
		System.out.println(Math.sqrt(125));
		
		context.close();
	}

}
