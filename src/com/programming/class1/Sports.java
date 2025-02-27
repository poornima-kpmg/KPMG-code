package com.programming.class1;

//what's declared in interface can be used in other class using "implements"
public interface Sports {
	
	public abstract void setHomeTeam(String name);
	public void setVisitingTeam(String name);
	public void setVenue(String name);
	int defaultNumberOfPlayers = 15;

}
