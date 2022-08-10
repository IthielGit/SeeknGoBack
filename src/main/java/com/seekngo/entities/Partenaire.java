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


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("Partenaire")
public class Partenaire extends User{
	@Column(length = 30, nullable = true)
	private String numNif;
	
	@Column(length = 30, nullable = true)
	private String numStat;
	
	@Column(length = 30, nullable = true)
	private String numRcs;
	
	@Column(nullable = true)
	@OneToMany(mappedBy = "partenaire",fetch = FetchType.LAZY)
	private Collection<TicketResa>ticketResas;
	
	@Column( nullable = true)
	@OneToMany(mappedBy = "partenaire",fetch = FetchType.LAZY)
	private Collection<Prestation>prestations;
	
	@Column(nullable = true)
	@OneToMany(mappedBy = "partenaire",fetch = FetchType.LAZY)
	private Collection<FactureAbnmt>factureAbnmts;
	
	public Partenaire(Long idUser, String email, String password, String numTel, String adresse, Authority authority,
			String numNif, String numStat, String numRcs, Collection<TicketResa> ticketResas,
			Collection<Prestation> prestations, Collection<FactureAbnmt> factureAbnmts) {
		super(idUser, email, password, numTel, adresse, authority);
		this.numNif = numNif;
		this.numStat = numStat;
		this.numRcs = numRcs;
		this.ticketResas = ticketResas;
		this.prestations = prestations;
		this.factureAbnmts = factureAbnmts;
	}

}
	
	
	
	

