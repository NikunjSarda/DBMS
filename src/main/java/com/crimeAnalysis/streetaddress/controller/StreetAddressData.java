package com.crimeAnalysis.streetaddress.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StreetAddressData {
	
	@Id
	private Integer Id;
	private String Address;
	
	//constructor
	public StreetAddressData() {
		
	}
	
	public StreetAddressData(Integer Id, String Address) {
		super();
		this.Id = Id;
		this.Address = Address;
	}
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		this.Id = id;
	}
	
	public String getReport_Time() {
		return Address;
	}
	public void setReport_Time(String address) {
		this.Address = address;
	}

}
