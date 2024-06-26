package com.example.ommpproject.projectommp.services;

import com.example.ommpproject.projectommp.repositories.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ommpproject.projectommp.models.*;

@Service
public class ObservationServiceImpl implements ObservationService {
	@Autowired
	private ObservationRepository ObsRep;
	
	@Override

	public List<Observation> getAllObservations() {
		// TODO Auto-generated method stub
		return this.ObsRep.findAll();
	}
	@Override
	
	public Observation addObs(Observation o) {
		// TODO Auto-generated method stub
		return this.ObsRep.save(o);
	}
}
