package com.example.ommpproject.projectommp.repositories;


import com.example.ommpproject.projectommp.models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface compteRepository extends JpaRepository<Compte, Long> {
    Optional<Compte> findByNumCompte(int numCompte);
}
