package com.crimeAnalysis.streetaddress.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimeAnalysis.state.controller.StateData;

@RestController
public class StreetAddressDataController {
	
	@Autowired
	private StreetAddressDataService streetAddressDataService;
	@RequestMapping("/streetaddressdata")
	public List<StateData> getAllStateData() {
		return streetAddressDataService.getAllStreetAddressData();
	}
	//If path variable and name not same then , @PathVariable("pathvariable") Stirng id
		 @RequestMapping("/streetaddressdata/{id}")
		 public Optional<StreetAddressData> getStreetAddressData(@PathVariable Integer id)
		 {
			return streetAddressDataService.findById(id) ;
		 }


}
