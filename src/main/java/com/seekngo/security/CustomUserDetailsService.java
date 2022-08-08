package com.seekngo.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.seekngo.entities.User;
import com.seekngo.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User user = userRepository.findByEmail(email).orElseThrow(
				()->new UsernameNotFoundException("Utilisateur introuvable"));
		
		return new org.springframework.security.core.userdetails.User(
				user.getEmail(), user.getPassword(), new ArrayList<>());		


	}

}
