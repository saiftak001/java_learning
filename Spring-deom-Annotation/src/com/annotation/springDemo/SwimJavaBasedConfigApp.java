package com.annotation.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaBasedConfigApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SwinCoachJavaConfiguration.class);

		Coach sportSwim = context.getBean("sportSwim", Coach.class);

		System.out.println(sportSwim.getCoachDetails());

		System.out.println(sportSwim.getFortuneDetails());

		System.out.println(sportSwim.getDataSource());

		System.out.println(Math.sqrt(125));

		context.close();
	}

}
