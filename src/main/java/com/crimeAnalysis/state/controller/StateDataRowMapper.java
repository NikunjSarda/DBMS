package com.crimeAnalysis.state.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StateDataRowMapper implements RowMapper<StateData>{
	
	@Override
	public StateData mapRow(ResultSet rs, int rowNum) throws SQLException {

		StateData stateData = new StateData();
		stateData.setState( rs.getString("state"));
		return stateData;
	}

}
