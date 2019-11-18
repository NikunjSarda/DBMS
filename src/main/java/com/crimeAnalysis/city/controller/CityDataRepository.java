package com.crimeAnalysis.city.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CityDataRepository extends CrudRepository<CityData, Integer>{
	
	List<CityData> findAll();
	Optional<CityData> findById(Integer Id);

}
