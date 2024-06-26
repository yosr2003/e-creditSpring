package com.example.ommpproject.projectommp.services;
import com.example.ommpproject.projectommp.repositories.*;
import com.example.ommpproject.projectommp.models.*;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DossierCreditImpl implements DossierCreditService {
	@Autowired
	private DossierCreditRepository dossierCreditRep;
	
	@Override
	public List<DossierCredit> getAllDossierCredit() {
		// TODO Auto-generated method stub
		return this.dossierCreditRep.findAll();
	}
	@Override
	public DossierCredit addDossierCredit(DossierCredit D) {
		// TODO Auto-generated method stub
		return this.dossierCreditRep.save(D);
	}
	
	
	

}
