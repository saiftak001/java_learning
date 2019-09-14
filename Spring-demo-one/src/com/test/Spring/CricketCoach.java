package com.test.Spring;

public class CricketCoach implements Coach {

	private Health coachHealth;
	private String email;
	private String team;

	@Override
	public String getCoachingDetails() {
		return "This is Cricket Coaching Class";
	}

	public Health getCoachHealth() {
		return coachHealth;
	}

	public void setCoachHealth(Health coachHealth) {
		this.coachHealth = coachHealth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCoachHealthDetails() {

		return coachHealth.healthStatus();
	}

}
