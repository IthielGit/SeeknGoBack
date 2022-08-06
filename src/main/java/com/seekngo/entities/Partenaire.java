package com.seekngo.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Partenaire")
public class Partenaire extends User{
	private String numNif;
	private String numStat;
	private String numRcs;
	private Collection<TicketResa>ticketResas;
	private Collection<Prestation>prestations;
}
