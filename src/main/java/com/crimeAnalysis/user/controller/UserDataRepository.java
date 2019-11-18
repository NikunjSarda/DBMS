package com.crimeAnalysis.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserDataRepository extends CrudRepository<UserData, Integer>{

	List<UserData> findAll();
	Optional<UserData> findById(Integer id);

}
