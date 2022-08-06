package com.seekngo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seekngo.entities.User;
import com.seekngo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public Iterable<User> listAll() {
		return this.userRepository.findAll();
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}

	public User getUserByID(long id) {
		return userRepository.findById(id).get();
	}

	public void updateUser(User user, int id) {
		userRepository.save(user);
	}

	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}

}
