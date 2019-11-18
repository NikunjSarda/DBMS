package com.crimeAnalysis.admin.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private String Email_Id;
	
	public Admin() {
	}
	
	public Admin(String Email_Id) {
		super();
		this.Email_Id = Email_Id;
	}
	
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String Email_Id) {
		this.Email_Id = Email_Id;
	}
}
