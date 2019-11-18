package com.crimeAnalysis.state.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface StateDataRepository extends CrudRepository<StateData, Integer>{
	
	List<StateData> findAll();
	Optional<StateData> findById(Integer Id);

}
