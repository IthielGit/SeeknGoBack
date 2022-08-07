package com.seekngo.repository;

import com.seekngo.entities.HeureDispo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeureDispoRepository extends JpaRepository<HeureDispo,Long> {
}
