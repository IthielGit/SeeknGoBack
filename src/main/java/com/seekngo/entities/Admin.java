package com.seekngo.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("Admin")
public class Admin extends User {
	private String nom;
	private String prenom;
	private String poste;
	
	//manually generated (not using lombok in this constructor : Ithiel)
	public Admin(Long id, String email, String numTel, String adresse, String password, String nom, String prenom,
			String poste) {
		super(id, email, numTel, adresse, password);
		this.nom = nom;
		this.prenom = prenom;
		this.poste = poste;
	}
	
	
}
