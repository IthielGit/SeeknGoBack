package com.seekngo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Admin")
public class Admin extends User {
	private String nom;
	private String prenom;
	private String poste;
}
