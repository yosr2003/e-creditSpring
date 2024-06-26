package com.example.ommpproject.projectommp.controller;

import com.example.ommpproject.projectommp.repositories.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ommpproject.projectommp.models.*;

import java.util.List;

@RestController
@RequestMapping("/comptes")
public class CompteController {

    @Autowired
    private compteRepository compteRepo;

    @GetMapping
    public List<Compte> getAllComptes() {
        return compteRepo.findAll();
    }

    @PostMapping
    public Compte createCompte(@RequestBody Compte newCompte) {
        return compteRepo.save(newCompte);
    }
}
