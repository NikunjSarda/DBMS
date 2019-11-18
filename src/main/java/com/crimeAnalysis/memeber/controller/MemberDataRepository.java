package com.crimeAnalysis.memeber.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface MemberDataRepository extends CrudRepository<MemberData, Integer>{
	
	List<MemberData> findAll();
	Optional<MemberData> findById(Integer Id);

}
