package com.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	
	public static void main(String[] agrs) {
		
		try {
			
			ObjectMapper mapper= new ObjectMapper();
			
			Student theStudent=mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName());
			
			Address theAddress= theStudent.getAddress();
			
			System.out.println(theAddress.getCity());
			System.out.println(theAddress.getState());
			System.out.println(theAddress.getStreet());
			
			for(String getLanguages: theStudent.getLanguages()) {
				System.out.println(getLanguages);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
