package com.example.ommpproject.projectommp.controller;

import com.example.ommpproject.projectommp.services.*;
import com.example.ommpproject.projectommp.models.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/DossierCredit")
@CrossOrigin(origins = "http://localhost:4200")
public class DossierCreditController {
    
    @Autowired
    DossierCreditService dossierCreditService;

    @GetMapping
    public List<DossierCredit> getAllDossierCredit() {
        return dossierCreditService.getAllDossierCredit();
    }

    @PostMapping 
    public DossierCredit newDossier(@RequestBody DossierCredit newDossier) {
        return dossierCreditService.addDossierCredit(newDossier);
    }
}
