package com.crimeAnalysis.state.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateDataController {
	
	@Autowired
	private StateDataService stateDataService;
	@RequestMapping("/statedata")
	public List<StateData> getAllStateData() {
		return stateDataService.getAllStateData();
	}
	//If path variable and name not same then , @PathVariable("pathvariable") Stirng id
		 @RequestMapping("/statedata/{id}")
		 public Optional<StateData> getStateData(@PathVariable Integer id)
		 {
			return stateDataService.findById(id) ;
		 }

}
