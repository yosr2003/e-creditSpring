package com.example.ommpproject.projectommp.services;

import com.example.ommpproject.projectommp.models.Client;
import com.example.ommpproject.projectommp.models.Compte;


import com.example.ommpproject.projectommp.repositories.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clientServiceImpl implements clientService {
    @Autowired
    private clientRepository clientRepository;

    @Autowired
    private compteRepository compteRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientByCIN(int cin) {
        Optional<Client> optionalClient = clientRepository.findByCin(cin);

        if (optionalClient.isPresent()) {
            return optionalClient.get();
        } else {
            throw new ClientNotFoundException("Client not found for CIN: " + cin);
        }
    }

    @Override
    public List<Compte> getComptesByCIN(int cin) {
        Optional<Client> client = clientRepository.findByCin(cin);
        return client.map(Client::getComptes).orElse(Collections.emptyList());
    }

    @Override
    public Compte getCompteByNumCompte(int NumCompte) {
        Optional<Compte> optionalCompte = compteRepository.findByNumCompte(NumCompte);

        if (optionalCompte.isPresent()) {
            return optionalCompte.get();
        } else {
            throw new CompteNotFoundException("Compte not found for NumCompte: " + NumCompte);
        }
    }

    @Override
    public Client createClient(Client newClient) {
        return clientRepository.save(newClient);
    }
    
    
 
    @Override
    public Client getClientByCompteId(Long compteId) {
    
        Optional<Client> optionalClient = clientRepository.findByComptesIdCompte(compteId);
        return optionalClient.orElseThrow(() -> new ClientNotFoundException("Client not found for compteId: " + compteId));
    }
    
    


}
