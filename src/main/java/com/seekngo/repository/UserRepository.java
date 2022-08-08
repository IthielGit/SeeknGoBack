package com.seekngo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seekngo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	 Optional<User> findByEmail(String email);
}
