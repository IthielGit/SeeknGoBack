package com.seekngo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

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
	
//	@OneToMany(mappedBy = "ticketResa")	
//	private List<Prestation> prestations;
	
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ID_PRESTATION", nullable = true)
	private Prestation prestation;
	
//	@ManyToOne
//	@JsonIgnore
//	@JoinColumn(name = "ID_PLANNING", nullable = true)
//	private Planning planning;
	
	@Column(length = 30, nullable = true)
	@OneToMany(fetch = FetchType.LAZY)
	private List<Planning> plannings;
		
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ID_CLIENT", nullable = true)
	private Client client;
	
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "ID_PARTENAIRE", nullable = true)
	private Partenaire partenaire;
	
//	@ManyToOne
//	@JsonIgnore
//	@JoinColumn(name="ID_FACTURE", nullable = true)
//	private FactureAbnmt factureAbnmt;

}
