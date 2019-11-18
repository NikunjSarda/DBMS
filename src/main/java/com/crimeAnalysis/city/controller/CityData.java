package com.crimeAnalysis.city.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CityData {
	
	@Id
	private String City;
	
	public CityData() {
	}
	
	public CityData(String City) {
		super();
		this.City = City;
	}
	
	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
}
