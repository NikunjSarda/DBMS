package com.crimeAnalysis.memeber.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class MemberDataController {
	
	@Autowired
	private MemberDataService memberDataService;
	@RequestMapping("/memberData")
	public List<MemberData> getAllMemeberData() {
		return memberDataService.getAllMemberData();
	}
	//If path variable and name not same then , @PathVariable("pathvariable") Stirng id
		 @RequestMapping("/memberData/{id}")
		 public Optional<MemberData> getmemberData(@PathVariable Integer id)
		 {
			return memberDataService.findById(id) ;
		 }

}
