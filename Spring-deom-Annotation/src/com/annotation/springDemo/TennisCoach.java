package com.annotation.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fortuneDuplicateService")

	private Fortune fortune;
	
	@Autowired
	@Qualifier("componentScan")
	private DataSource dataSource;

	/*
	 * @Autowired TennisCoach(@Qualifier("fortuneDuplicateService") Fortune fortune)
	 * { this.fortune = fortune; }
	 * 
	 * @Autowired public void setFurtuneService(Fortune fortune) { this.fortune =
	 * fortune; }
	 */

	@Override
	public String getCoachDetails() {

		return "Practice tennis on a daily basis";
	}

	@Override
	public String getFortuneDetails() {
		// TODO Auto-generated method stub
		return fortune.provideService();
	}


	public String getDataSource() {
		// TODO Auto-generated method stub
		return dataSource.getDataSourceValues();
	}

}
