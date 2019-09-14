package com.annotation.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:dataSource.properties")
//@ComponentScan("com.annotation.springDemo")
public class SwinCoachJavaConfiguration {

	@Bean
	public FortuneService fortuneService() {
		return new FortuneService();
	}

	@Bean
	@Scope("prototype")
	public Coach sportSwim() {
		return new SportSwim(fortuneService());
	}

}
