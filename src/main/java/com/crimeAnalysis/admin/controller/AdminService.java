package com.crimeAnalysis.admin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimeAnalysis.demo.controller.CrimeData;
import com.crimeAnalysis.memeber.controller.MemberData;
import com.crimeAnalysis.memeber.controller.MemberDataRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public List<Admin> getAllAdmin() {
		List<Admin> adminData = new ArrayList<>() ;
		adminRepository.findAll().forEach(adminData::add);
		return adminData ;
	}

	public Optional<Admin> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
