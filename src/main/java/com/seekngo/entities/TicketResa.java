package com.seekngo.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class TicketResa extends User {
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "ID_Partenaire")
	private Partenaire partenaire;
	
}
