package com.crimeAnalysis.memeber.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDataService {
	
	@Autowired
	private MemberDataRepository memberDataRepository;
	public List<MemberData> getAllMemberData()
	{
		//return memberData ;
		List<MemberData> memberData = new ArrayList<>() ;
		memberDataRepository.findAll().forEach(memberData::add);
		return memberData ;
	}

	public Optional<MemberData> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
