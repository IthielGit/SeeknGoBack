package com.seekngo.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.seekngo.entities.User;
import com.seekngo.repository.UserRepository;


//@Service
//public abstract class CustomUserDetailsService implements UserDetailsService {
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	public UserDetails loadUserByID(long id) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		User user = userRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("User not found"));
//		
//		return new org.springframework.security.core.userdetails.User(user.getIdUser(), user.getPassword(), new ArrayList<>());
//	}
//}



