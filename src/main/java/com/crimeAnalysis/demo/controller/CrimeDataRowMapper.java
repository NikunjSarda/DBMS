package com.crimeAnalysis.demo.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CrimeDataRowMapper implements RowMapper<CrimeData> {
	
	@Override
    public CrimeData mapRow(ResultSet rs, int rowNum) throws SQLException {

		CrimeData crimeData = new CrimeData();
		crimeData.setId( rs.getInt("ID"));
		
		crimeData.setReport_Time(rs.getString("report_time")); 
		crimeData.setLatitude(rs.getString("latitude"));
		crimeData.setLongitude(rs.getString("longitude"));
		crimeData.setReport_Date(rs.getString("Report_Date"));
		crimeData.setLast_Updated_By(rs.getString("Last_Updated_By"));
		crimeData.setOffense_Time(rs.getString("Offense_Time"));
		crimeData.setC_Name(rs.getString("C_Name"));
		crimeData.setS_Name(rs.getString("S_Name"));
		crimeData.setC_Type(rs.getString("C_Type"));
		crimeData.setA_ID(rs.getInt("A_id"));

        return crimeData;

    }

}
