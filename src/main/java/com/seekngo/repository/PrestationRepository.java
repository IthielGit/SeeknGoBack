package com.seekngo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seekngo.entities.Prestation;

public interface PrestationRepository extends JpaRepository<Prestation, Long> {
}
