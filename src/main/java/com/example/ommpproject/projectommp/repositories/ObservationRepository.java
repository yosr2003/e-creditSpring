package com.example.ommpproject.projectommp.repositories;


import com.example.ommpproject.projectommp.models.Observation;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservationRepository extends JpaRepository<Observation, Long> {

	List<Observation> findAll();

}
