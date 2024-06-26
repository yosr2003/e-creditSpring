package com.example.ommpproject.projectommp.repositories;

import com.example.ommpproject.projectommp.models.Garantie;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GarantieRepository extends JpaRepository<Garantie, Long> {
	 Optional<Garantie> findById(Long id);

}
