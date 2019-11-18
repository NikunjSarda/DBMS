package com.crimeAnalysis.admin.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AdminRowMapper implements RowMapper<Admin>{
	
	@Override
    public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {

		Admin adminData = new Admin();
		adminData.setEmail_Id( rs.getString("email_Id"));
		
		return adminData;
	}

}
