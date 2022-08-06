package com.seekngo.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seekngo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	 
}
