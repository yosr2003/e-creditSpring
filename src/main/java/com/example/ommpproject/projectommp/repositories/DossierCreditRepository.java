package com.example.ommpproject.projectommp.repositories;

import com.example.ommpproject.projectommp.models.DossierCredit;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierCreditRepository extends JpaRepository<DossierCredit, Long> {

}
