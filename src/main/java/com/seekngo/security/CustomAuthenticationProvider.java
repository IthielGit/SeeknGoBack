package com.seekngo.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.seekngo.entities.User;
import com.seekngo.repository.UserRepository;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String email= authentication.getName();
		String password = authentication.getCredentials().toString();

		User user = userRepository.findByEmail(email).orElseThrow(()->
		new UsernameNotFoundException("Utilisateur introuvable")
				);
		//compare input password and our encrypted password in database 
		if(passwordEncoder.matches(password, user.getPassword())){
			List<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(user.getAuthority().getAuthority()));

			return new UsernamePasswordAuthenticationToken(email, password, authorities);// arraylist for the authorities
		}else {
			throw new BadCredentialsException("Identifiants incorrects");
		}

	}

	@Override
	public boolean supports(Class<?> authentication) {

		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
