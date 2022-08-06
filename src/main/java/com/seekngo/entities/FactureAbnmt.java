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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class FactureAbnmt implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaiementCommission;
	@OneToMany(mappedBy = "factureAbnmt")
	private Collection<TicketResa>ticketResas;
	@ManyToOne
	@JoinColumn(name="ID_PARTENAIRE")
	private Partenaire partenaire;
	
	
	private Date paiementDate;
	private double prixTicket;
	private double commisionRate;
	private double netaPayer;
	
	
}
