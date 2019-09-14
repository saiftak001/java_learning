package com.test.Spring;

import java.util.Random;

public class CoachHealth implements Health {

	@Override
	public String healthStatus() {
		String[] arr= {"Hey","Hello","See you","Bye"};
		Random rand = new Random();
		
		return arr[rand.nextInt(arr.length)];
	}

}
