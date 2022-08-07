package com.seekngo.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Client")
public class Client extends User{
	@Column(length = 30, nullable = false)
	private String nom;
	@Column(length = 30, nullable = false)
	private String prenom;
	@Column(nullable = true)
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private Collection<TicketResa>ticketResas;
	
	
	//manually generated (not using lombok in this constructor)
	public Client(Long id, String email, String numTel, String adresse, String password, String nom, String prenom,
			Collection<TicketResa> ticketResas) {
		super(id, email, numTel, adresse, password);
		this.nom = nom;
		this.prenom = prenom;
		this.ticketResas = ticketResas;

	}
}
