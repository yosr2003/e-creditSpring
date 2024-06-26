package com.example.ommpproject.projectommp.services;



import java.util.List;

import com.example.ommpproject.projectommp.models.Garantie;



public interface GarantieService {

	Garantie addLigneGarantie(Garantie g);

	Garantie editLigneGarantie(Garantie g);

	Garantie getGarantieById(Long id);

	void deleteGarantieById(Long id);

	List<Garantie> getAllGaranties();


}
