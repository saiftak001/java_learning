package com.annotation.springDemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneDuplicateService implements Fortune {

	@Override
	public String provideService() {
		return "This is a test for qualifier annotation";
	}

}
