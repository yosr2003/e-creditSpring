package com.example.ommpproject.projectommp.services;

import com.example.ommpproject.projectommp.models.DemandeCredit;
import com.example.ommpproject.projectommp.repositories.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import java.util.List;


@Service
public class DemandeCreditImpl implements DemandeCreditService {

    @Autowired
    private DemandeCreditRepository demandeCreditRepository;
   

   

    @Override
    public List<DemandeCredit> getAllDemandesCredit() {
        return this.demandeCreditRepository.findAll();
    }

    @Override
    public List<DemandeCredit> findAll() {
        return this.demandeCreditRepository.findAll();
    }

    @Override
    public DemandeCredit save(DemandeCredit newDemandeCredit) {
        return this.demandeCreditRepository.save(newDemandeCredit);
    }
    
    
   
    @Override
    public DemandeCredit updateStatut(Long demandeId, String newStatut) {
        DemandeCredit demandeCredit = this.demandeCreditRepository.findById(demandeId).orElse(null);
        if (demandeCredit != null) {
            demandeCredit.setStatut(newStatut);
            return this.demandeCreditRepository.save(demandeCredit);
        }
        return null; // or throw an exception if needed
    }
    
    
    
    
    
   
    
    
  
}
