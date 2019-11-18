package com.crimeAnalysis.user.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserData {
	
	@Id
	private String Email_Id;
	private String Password;
	private String First_Name;
	private String Last_Name;
	
	public UserData() {
	}
	
	public UserData(String Email_Id, String Password, String First_Name, String Last_Name) {
		super();
		this.Email_Id = Email_Id;
		this.Password = Password;
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
	}
	
	public String getEmail_Id() {
		return Email_Id;
	}
	
	public void setEmail_Id(String Email_Id) {
		this.Email_Id = Email_Id;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	public String getFirstName() {
		return First_Name;
	}
	
	public void setFirstName(String First_Name) {
		this.First_Name = First_Name;
	}
	
	public String getLastName() {
		return Last_Name;
	}
	
	public void setLastName(String Last_Name) {
		this.Last_Name = Last_Name;
	}
	
}
