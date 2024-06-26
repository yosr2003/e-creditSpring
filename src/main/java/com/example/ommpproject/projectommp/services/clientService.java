package com.example.ommpproject.projectommp.services;




import java.util.List;

import com.example.ommpproject.projectommp.models.Client;
import com.example.ommpproject.projectommp.models.Compte;

public interface clientService {
    List<Client> getAllClients();
    Client getClientByCIN(int cin);
    List<Compte> getComptesByCIN(int cin);
    Compte getCompteByNumCompte(int NumCompte);
	Client createClient(Client newClient);

	Client getClientByCompteId(Long compteId);
	
}
