package com.crimeAnalysis.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrimeDataService {

	@Autowired
	private CrimeDataRepository crimeDataRepository ;
	private List<CrimeData> crimeData = Arrays.asList(
			
			
			new CrimeData(1 , "Robbery" ," Happened at 1","Robbery","Robbery","Robbery","Robbery","Robbery","Robbery","Robbery",2),
			new CrimeData(2 , "Robbery" ," Happened at 1","Robbery","Robbery","Robbery","Robbery","Robbery","Robbery","Robbery",2)
			) ;
	
	public List<CrimeData> getAllCrimeData()
	{
		//return crimeData ;
		List<CrimeData> crimeData = new ArrayList<>() ;
		crimeDataRepository.findAll().forEach(crimeData::add);
		return crimeData ;
	}
	
	public Optional<CrimeData> getCrimeData(Integer id)
	{
		//return crimeData.stream().filter(t -> t.getId().equals(id) ).findFirst().get()  ;
		return crimeDataRepository.findById(id) ;
	}
}
