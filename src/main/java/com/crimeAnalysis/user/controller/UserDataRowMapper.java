package com.crimeAnalysis.user.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserDataRowMapper implements RowMapper<UserData> {
	
	@Override
    public UserData mapRow(ResultSet rs, int rowNum) throws SQLException {

		UserData userData = new UserData();
		userData.setEmail_Id( rs.getString("Email_Id"));
		
		userData.setPassword(rs.getString("password")); 
		userData.setFirstName(rs.getString("First Name"));
		userData.setLastName(rs.getString("Last Name"));
		
		return userData;
	}

}
