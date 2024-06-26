package com.example.ommpproject.projectommp.repositories;

import com.example.ommpproject.projectommp.models.PiecesJointes;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PiecesRepository extends JpaRepository<PiecesJointes, Long>{
	 Optional<PiecesJointes> findById(Long id);
}
