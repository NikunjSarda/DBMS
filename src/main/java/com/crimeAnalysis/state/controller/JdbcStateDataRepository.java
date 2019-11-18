package com.crimeAnalysis.state.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcStateDataRepository implements StateDataRepository {

	// Spring Boot will create and configure DataSource and JdbcTemplate
	// To use it, just @Autowired
    @Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public <S extends StateData> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends StateData> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<StateData> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return jdbcTemplate
                .queryForObject("select count(*) from Crime_Data", Integer.class);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(StateData entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends StateData> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StateData> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<StateData> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
