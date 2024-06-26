package com.example.ommpproject.projectommp.services;


import java.util.List;

import com.example.ommpproject.projectommp.models.DemandeCredit;

public interface DemandeCreditService {
    List<DemandeCredit> getAllDemandesCredit();


	List<DemandeCredit> findAll();


	DemandeCredit save(DemandeCredit newDemandeCredit);


	DemandeCredit updateStatut(Long demandeCreditId, String newStatut);





	
}
