package com.seekngo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seekngo.entities.Planning;

@Repository
public interface PlanningRepository extends JpaRepository<Planning, Long> {

}