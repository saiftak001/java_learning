package com.annotation.springDemo;

import org.springframework.stereotype.Component;

@ Component
public class FortuneService implements Fortune {

	@Override
	public String provideService() {
		return "Be happy as always and be alert";
	}

}
