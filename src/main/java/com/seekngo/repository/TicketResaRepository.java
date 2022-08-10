package com.seekngo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seekngo.entities.TicketResa;

@Repository
public interface TicketResaRepository extends JpaRepository<TicketResa, Long> {
}
