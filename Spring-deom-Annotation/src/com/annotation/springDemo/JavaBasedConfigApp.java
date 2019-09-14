package com.annotation.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SpringConfigJava.class);

		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(tennisCoach.getCoachDetails());
		
		System.out.println(tennisCoach.getFortuneDetails());
		
		System.out.println(tennisCoach.getDataSource());
		
		System.out.println(Math.sqrt(125));
		
		context.close();
	}

}
