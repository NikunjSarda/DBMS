package com.crimeAnalysis.streetaddress.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StreetAddressDataRowMapper implements RowMapper<StreetAddressData>{
	
	@Override
	public StreetAddressData mapRow(ResultSet rs, int rowNum) throws SQLException {

		StreetAddressData streetAddressData = new StreetAddressData();
		streetAddressData.setId(rs.getInt("id"));
		streetAddressData.setReport_Time( rs.getString("state"));
		return streetAddressData;
	}

}
