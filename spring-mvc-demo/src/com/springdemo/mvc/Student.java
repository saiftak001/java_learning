package com.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	
	@NotNull(message="not accepted without spaces")
	@Size(min=1,message="is required")
	private String lastName;
	private String country;
	
	@NotNull(message="is required")
	@Min(value=0, message="should be greater than 0")
	@Max(value=10, message="should be less the 10")
	private String freeSpace;
	
	private LinkedHashMap<String, String> countryCode;

	public Student() {

		countryCode = new LinkedHashMap<String, String>();

		countryCode.put("BR", "Brazil");
		countryCode.put("IN", "India");
		countryCode.put("GR", "Germany");

	}
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryCode() {
		return countryCode;
	}



	public String getFreeSpace() {
		return freeSpace;
	}



	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
	}

}
