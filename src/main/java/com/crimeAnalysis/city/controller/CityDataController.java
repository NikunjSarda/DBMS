package com.crimeAnalysis.city.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crimeAnalysis.demo.controller.CrimeData;

public class CityDataController {
	@Autowired
	private CityDataService cityDataService;
	@RequestMapping("/citydata")
	public List<String> getAllAdmin() {
		return cityDataService.getAllCity();
	}
	//If path variable and name not same then , @PathVariable("pathvariable") Stirng id
		 @RequestMapping("/citydata/{id}")
		 public Optional<CityData> getCityData(@PathVariable Integer id)
		 {
			return cityDataService.findById(id) ;
		 }
	

}
