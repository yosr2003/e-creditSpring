package com.example.ommpproject.projectommp.repositories;





import java.util.Optional;
import com.example.ommpproject.projectommp.models.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface clientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByCin(int cin);
 
    Optional<Client> findByComptesIdCompte(Long compteId);
}
