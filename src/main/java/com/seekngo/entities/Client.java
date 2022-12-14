package com.seekngo.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data 
@NoArgsConstructor 
@AllArgsConstructor
@DiscriminatorValue("Client")
public class Client extends User{
	public Client(Long idUser, String email, String password, String numTel, String adresse, Authority authority,
			String nom, String prenom) {
		super(idUser, email, password, numTel, adresse, authority);
		this.nom = nom;
		this.prenom = prenom;
	}

	@Column(length = 30, nullable =true)
	private String nom;
	
	@Column(length = 30, nullable = true)
	private String prenom;
	
//	@Column(nullable = true)
//	@JsonIgnore
//	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
//	private Collection<TicketResa>ticketResas;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

}
