package com.seekngo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seekngo.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
