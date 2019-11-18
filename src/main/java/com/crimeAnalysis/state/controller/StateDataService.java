package com.crimeAnalysis.state.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateDataService {
	
	@Autowired
	private StateDataRepository stateDataRepository;
	public List<StateData> getAllStateData()
	{
		//return memberData ;
		List<StateData> stateData = new ArrayList<>() ;
		stateDataRepository.findAll().forEach(stateData::add);
		return stateData ;
	}
	
	public Optional<StateData> findById(Integer id)
	{
		//return memberData.stream().filter(t -> t.getId().equals(id) ).findFirst().get()  ;
		return stateDataRepository.findById(id) ;
	}

}
