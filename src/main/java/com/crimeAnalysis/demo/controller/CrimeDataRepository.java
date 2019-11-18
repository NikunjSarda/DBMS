package com.crimeAnalysis.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CrimeDataRepository extends CrudRepository<CrimeData, Integer> {
	
	List<CrimeData> findAll();
	Optional<CrimeData> findById(Integer id);
}
