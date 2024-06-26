package com.example.ommpproject.projectommp.services;
import com.example.ommpproject.projectommp.models.*;


import java.util.List;




public interface DossierCreditService {
	
	   List<DossierCredit> getAllDossierCredit();
	   public DossierCredit addDossierCredit(DossierCredit D);
}
