package com.annotation.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportSwim implements Coach {

	Fortune fortuneService;
	
	
	@Value("${data.one}")
	private String dataOne;
	
	

	SportSwim(Fortune fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getCoachDetails() {
		// TODO Auto-generated method stub
		return "Swin Coach is a Man";
	}

	@Override
	public String getFortuneDetails() {
		// TODO Auto-generated method stub
		return "I am happy";
	}

	@Override
	public String getDataSource() {
		// TODO Auto-generated method stub
		return this.dataOne;
	}

}
