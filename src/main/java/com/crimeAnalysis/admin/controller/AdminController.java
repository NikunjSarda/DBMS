package com.crimeAnalysis.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimeAnalysis.demo.controller.CrimeData;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	@RequestMapping("/admin")
	public List<Admin> getAllAdmin() {
		return adminService.getAllAdmin();
	}
	//If path variable and name not same then , @PathVariable("pathvariable") Stirng id
		 @RequestMapping("/admin/{id}")
		 public Optional<Admin> getAdmin(@PathVariable Integer id)
		 {
			return adminService.findById(id) ;
		 }
	
}
