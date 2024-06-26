package com.example.ommpproject.projectommp.services;

import com.example.ommpproject.projectommp.repositories.*;
import com.example.ommpproject.projectommp.models.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Ajout de l'annotation @Service



@Service
public class GarantieServiceImpl implements GarantieService {

    @Autowired
    private GarantieRepository garantieRepository;

    @Override
    public List<Garantie> getAllGaranties() {
        return garantieRepository.findAll();
    }

    @Override
    public Garantie addLigneGarantie(Garantie g) {
        return garantieRepository.save(g);
    }

    @Override
    public Garantie editLigneGarantie(Garantie g) {
        return garantieRepository.save(g);
    }

    @Override
    public Garantie getGarantieById(Long id) {
        Optional<Garantie> t = garantieRepository.findById(id);
        return t.isPresent() ? t.get() : null;
    }

    @Override
    public void deleteGarantieById(Long id) {
        garantieRepository.deleteById(id);
    }
}
