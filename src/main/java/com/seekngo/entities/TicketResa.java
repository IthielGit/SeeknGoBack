package com.seekngo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class TicketResa implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTicketResa;
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "ID_PARTENAIRE")
	private Partenaire partenaire;
	
}
