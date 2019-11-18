package com.crimeAnalysis.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDataController {
	
	@Autowired
	private UserDataService userDataService;
	@RequestMapping("/userdata")
	 public List<UserData> getAllUserData()
	 {
		return userDataService.getAllUserData() ;
	 }
	
	 //If path variable and name not same then , @PathVariable("pathvariable") Stirng id
	 @RequestMapping("/userdata/{id}")
	 public Optional<UserData> getUserData(@PathVariable Integer id)
	 {
		return userDataService.getUserData(id) ;
	 }

}
