package com.seekngo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seekngo.entities.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
