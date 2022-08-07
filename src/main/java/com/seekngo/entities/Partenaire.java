package com.seekngo.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Partenaire")
public class Partenaire extends User{
	@Column(length = 30, nullable = true)
	private String numNif;
	@Column(length = 30, nullable = true)
	private String numStat;
	@Column(length = 30, nullable = true)
	private String numRcs;
	@Column(nullable = true)
	@OneToMany(mappedBy = "partenaire")
	private Collection<TicketResa>ticketResas;
	@Column( nullable = true)
	@OneToMany(mappedBy = "partenaire")
	private Collection<Prestation>prestations;
	@Column(nullable = true)
	@OneToMany(mappedBy = "partenaire")
	private Collection<FactureAbnmt>factureAbnmts;
	
	//manually generated (not using lombok in this constructor)
	public Partenaire(Long id, String email, String numTel, String adresse, String password, String numNif,
			String numStat, String numRcs, Collection<TicketResa> ticketResas, Collection<Prestation> prestations) {
		super(id, email, numTel, adresse, password);
		this.numNif = numNif;
		this.numStat = numStat;
		this.numRcs = numRcs;
		this.prestations = prestations;
	}
	
	
	
	
}
