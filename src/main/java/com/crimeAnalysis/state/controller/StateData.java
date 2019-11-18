package com.crimeAnalysis.state.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StateData {
	
	@Id
	private String State;
	
	public StateData() {
	}
	
	public StateData(String State) {
		super();
		this.State = State;
	}
	
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
}
