package com.seekngo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="ReservationTicket")
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
	private Collection<Prestation> prestations;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ID_CLIENT", nullable = true)
	private Client client;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ID_PARTENAIRE", nullable = true)
	private Partenaire partenaire;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="ID_FACTURE", nullable = true)
	private FactureAbnmt factureAbnmt;
	
	
}
