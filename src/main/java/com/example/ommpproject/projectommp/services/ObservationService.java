package com.example.ommpproject.projectommp.services;
import com.example.ommpproject.projectommp.models.*;

import java.util.List;



public interface ObservationService {

	Observation addObs(Observation o);

	List<Observation> getAllObservations();

}
