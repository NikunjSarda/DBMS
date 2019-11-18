package com.crimeAnalysis.memeber.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberDataRowMapper implements RowMapper<MemberData>{
	
	@Override
	public MemberData mapRow(ResultSet rs, int rowNum) throws SQLException {

		MemberData memberData = new MemberData();
		memberData.setEmail_Id( rs.getString("Email_Id"));
		return memberData;
	}

}
