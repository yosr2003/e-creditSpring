package com.example.ommpproject.projectommp.controller;

import com.example.ommpproject.projectommp.services.*;
import com.example.ommpproject.projectommp.models.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/demandes-credit")
public class DemandeCreditController {

    @Autowired
    private DemandeCreditService demandeService;
    @Autowired
    private clientService clientService;

    @GetMapping
    public List<DemandeCredit> getAllDemandesCredit() {
        return this.demandeService.findAll();
    }

    @PostMapping
    public DemandeCredit createDemandeCredit(@RequestBody DemandeCredit newDemandeCredit) {
        return this.demandeService.save(newDemandeCredit);
    }
    @PutMapping("/{demandeId}/{statut}")
    public DemandeCredit updateStatut(@PathVariable Long demandeId, @PathVariable String statut) {
        return this.demandeService.updateStatut(demandeId, statut);
    }
    
    @GetMapping("/clients/compte/{compteId}")
    public String getClientNameByCompteId(@PathVariable Long compteId) {
        Client client = this.clientService.getClientByCompteId(compteId);
        return (client != null) ? client.getNomClient() : "Client not found";
    }
    
    

}
