package com.example.ommpproject.projectommp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ommpproject.projectommp.models.User;
@Repository
public interface UserRepositiry extends JpaRepository<User, Long> {

Boolean existsByEmail(String email);
Optional<User> findByEmail(String email);

//@Query("SELECT port FROM User u WHERE u.id= ?1")
//List <Port> getPort(Long userid);

}
