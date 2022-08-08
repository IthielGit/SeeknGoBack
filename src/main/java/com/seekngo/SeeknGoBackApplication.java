package com.seekngo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.seekngo.entities.Admin;
import com.seekngo.entities.Client;
import com.seekngo.entities.Partenaire;
import com.seekngo.entities.User;
import com.seekngo.repository.AdminRepository;
import com.seekngo.repository.ClientRepository;
import com.seekngo.repository.UserRepository;

@SpringBootApplication
public class SeeknGoBackApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AdminRepository adminRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SeeknGoBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		User admiUser2 = userRepository.save(
//				new Admin(null, "razaka@gmail.com", "passe", "03244", "Lot AZ 12", "CEO"));
//		User clienUser3 = userRepository.save(
//				new Client(null, "rabe@gmail.com", "passe", "0000012", "Lot 1235", "RAndria", "Njaka", null));
//		User partnerUser4  = userRepository.save(
//				new Partenaire(null, "partner@gmail.com", "passe", "032", "Lot 415", "nif 000", "stat000", "rcs 000", null, null, null));
	}

}
