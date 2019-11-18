package com.crimeAnalysis.city.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CityDataRowMapper implements RowMapper<CityData>{
	
	@Override
    public CityData mapRow(ResultSet rs, int rowNum) throws SQLException {

		CityData cityData = new CityData();
		cityData.setCity( rs.getString("city"));
		
		return cityData;
	}

}
