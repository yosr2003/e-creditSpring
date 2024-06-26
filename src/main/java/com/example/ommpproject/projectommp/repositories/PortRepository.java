package com.example.ommpproject.projectommp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ommpproject.projectommp.models.Port;
import com.example.ommpproject.projectommp.models.User;


@Repository
public interface PortRepository extends JpaRepository<Port, Long> {
	
	@Query("SELECT users FROM Port p WHERE p.id= ?1")
	List<User> findByPort(Long portid);

}

