package com.example.ommpproject.projectommp.controller;

import com.example.ommpproject.projectommp.models.*;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.ommpproject.projectommp.services.*;
@RestController
@RequestMapping("/observation")
@CrossOrigin(origins = "http://localhost:4200")
public class ObservationController {
	 @Autowired
	    private ObservationService ObsService;

	    @GetMapping
	    public List<Observation> getAllGaranties() {
	        return this.ObsService.getAllObservations();
	    }
	    @PostMapping
	    public Observation addObservation(@RequestBody Observation Observation) {
	        return this.ObsService.addObs(Observation);
	    }
}
