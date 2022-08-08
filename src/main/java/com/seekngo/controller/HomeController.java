package com.seekngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seekngo.model.UserModel;

@RestController
public class HomeController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/home")
	public String home() {
		return "you are on the home page";
	}

	@GetMapping("/dashboard") 
	public String dashboard() {
		return "This is dashboard contents";
	}

	@PostMapping("/login")
	public ResponseEntity<HttpStatus>login(@RequestBody UserModel userModel) throws Exception{
		Authentication authentication;
		try {
			authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							userModel.getEmail(), userModel.getPassword()));
			SecurityContextHolder.getContext().setAuthentication(authentication);

		} catch (BadCredentialsException e) {
			throw new Exception("Identifiant invalide");
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}


}
