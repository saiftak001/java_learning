package com.annotation.springDemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="componentScan")
public class DataSourceFromProperties implements DataSource {
	
	@Value("${data.one}")
	private String DataOne;
	@Value("${data.two}")
	private String DataTwo;
	@Value("${data.three}")
	private String DataThree;

	@Override
	public String getDataSourceValues() {
		// TODO Auto-generated method stub
		
		String[] dataStore = {DataOne,DataTwo,DataThree};
		
		Random random = new Random();
		
		//return "Application";
		return dataStore[random.nextInt(dataStore.length)];
	}
	
	
	
}
