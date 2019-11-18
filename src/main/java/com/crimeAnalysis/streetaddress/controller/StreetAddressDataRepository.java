package com.crimeAnalysis.streetaddress.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface StreetAddressDataRepository extends CrudRepository<StreetAddressData, Integer>{

	List<StreetAddressData> findAll();
	Optional<StreetAddressData> findById(Integer id);

}
