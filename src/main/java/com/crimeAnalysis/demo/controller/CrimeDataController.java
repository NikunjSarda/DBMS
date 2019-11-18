package com.crimeAnalysis.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrimeDataController {

	@Autowired
	private CrimeDataService crimeDataService;
	@RequestMapping("/crimedata")
	 public List<CrimeData> getAllCrimeData()
	 {
		return crimeDataService.getAllCrimeData() ;
	 }
	
	 //If path variable and name not same then , @PathVariable("pathvariable") Stirng id
	 @RequestMapping("/crimedata/{id}")
	 public Optional<CrimeData> getCrimeData(@PathVariable Integer id)
	 {
		return crimeDataService.getCrimeData(id) ;
	 }
	
}
