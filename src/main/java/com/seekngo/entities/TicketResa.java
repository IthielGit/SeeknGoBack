package com.seekngo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class TicketResa implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTicketResa;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date creationTicketDate;
	private String statutTicket;
	private String statutPaiemenCommission;
	private double prixTotal;
	@OneToMany(mappedBy = "ticketResa")	
	private Collection<Prestation>prestations;
	
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "ID_PARTENAIRE")
	private Partenaire partenaire;
	
	@ManyToOne
	@JoinColumn(name="ID_FACTURE")
	private FactureAbnmt factureAbnmt;
	
	
}
