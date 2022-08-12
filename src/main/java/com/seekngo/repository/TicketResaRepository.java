package com.seekngo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.seekngo.entities.TicketResa;

@Repository
public interface TicketResaRepository extends JpaRepository<TicketResa, Long> {
	
	@Query(value = "SELECT * FROM RESERVATION_TICKET", nativeQuery = true)
	List<TicketResa>find();
	
    
    
}
