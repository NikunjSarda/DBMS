package com.crimeAnalysis.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface AdminRepository extends CrudRepository<Admin, Integer> {
	
	List<Admin> findAll();
	Optional<Admin> findById(Integer id);

}
