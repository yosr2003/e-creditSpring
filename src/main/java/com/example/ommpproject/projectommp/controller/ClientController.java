package com.example.ommpproject.projectommp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.ommpproject.projectommp.services.*;
import com.example.ommpproject.projectommp.models.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*") // Allow requests from this origin hhhhhh
public class ClientController {

    @Autowired
    private clientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{cin}")
    public Client getClientByCIN(@PathVariable int cin) {
        return clientService.getClientByCIN(cin);
    }

    @GetMapping("/comptes/byCIN/{cin}")
    public ResponseEntity<List<Compte>> getComptesByCIN(@PathVariable int cin) {
        List<Compte> comptes = clientService.getComptesByCIN(cin);
        return ResponseEntity.ok(comptes);
    }

    @GetMapping("/compte/byNumCompte/{NumCompte}") // Modifier l'URL pour correspondre à l'Angular frontend
    public ResponseEntity<Compte> getCompteByNumCompte(@PathVariable int NumCompte) {
        Compte compte = clientService.getCompteByNumCompte(NumCompte);
        return ResponseEntity.ok(compte);
    }
    
    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client newClient) {
        Client createdClient = clientService.createClient(newClient);
        return ResponseEntity.ok(createdClient);
    }
    
    

    @GetMapping("/compte/{compteId}")
    public Client getClientByCompteId(@PathVariable Long compteId) {
        return clientService.getClientByCompteId(compteId);
    }

 
}
