package com.crimeAnalysis.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CrimeData {

	@Id
	private Integer id;
	private String Report_Time;
	private String Latitude ;
	private String Longitude ;
	private String Report_Date ;
	private String Last_Updated_By ;
	private String Offense_Time ;
	private String C_Name ;
	private String S_Name;
	private String C_Type;
	private Integer A_ID ; 
	
	public CrimeData()
	{
		
	}
	public CrimeData(Integer id, String Report_Time, String latitude, String longitude, String report_Date, String last_Updated_By,
			String offense_Time, String c_Name, String s_Name, String c_Type, Integer a_ID) {
		super();
		this.id = id;
		this.Report_Time = Report_Time;
		Latitude = latitude;
		Longitude = longitude;
		Report_Date = report_Date;
		Last_Updated_By = last_Updated_By;
		Offense_Time = offense_Time;
		C_Name = c_Name;
		S_Name = s_Name;
		C_Type = c_Type;
		A_ID = a_ID;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getReport_Time() {
		return Report_Time;
	}
	public void setReport_Time(String name) {
		this.Report_Time = name;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getReport_Date() {
		return Report_Date;
	}
	public void setReport_Date(String report_Date) {
		Report_Date = report_Date;
	}
	public String getLast_Updated_By() {
		return Last_Updated_By;
	}
	public void setLast_Updated_By(String last_Updated_By) {
		Last_Updated_By = last_Updated_By;
	}
	public String getOffense_Time() {
		return Offense_Time;
	}
	public void setOffense_Time(String offense_Time) {
		Offense_Time = offense_Time;
	}
	public String getC_Name() {
		return C_Name;
	}
	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}
	public String getS_Name() {
		return S_Name;
	}
	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}
	public String getC_Type() {
		return C_Type;
	}
	public void setC_Type(String c_Type) {
		C_Type = c_Type;
	}
	public Integer getA_ID() {
		return A_ID;
	}
	public void setA_ID(Integer a_ID) {
		A_ID = a_ID;
	}
	
	
}
