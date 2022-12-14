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
@Table(name="Facturation")
@Data @NoArgsConstructor @AllArgsConstructor
public class FactureAbnmt implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaiementCommission;
	
	@Column(length = 30, nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date paiementDate;
	
	@Column(length = 30, nullable = true)
	private double prixTicket;
	
	@Column(length = 30, nullable = true)
	private double commisionRate;
	
	@Column(length = 30, nullable = true)
	private double netaPayer;
	
//	@Column(length = 30, nullable = true)
//	@OneToMany(mappedBy = "factureAbnmt",fetch = FetchType.LAZY)
//	private Collection<TicketResa>ticketResas;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="ID_TICKET", nullable = true)
	private TicketResa ticketResa;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="ID_PARTENAIRE", nullable = true)
	private Partenaire partenaire;
	
	
	
	
}
