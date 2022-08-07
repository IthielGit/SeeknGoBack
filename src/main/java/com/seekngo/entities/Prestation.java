package com.seekngo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
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
public class Prestation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestation;
	@Column(length = 30, nullable = true)
	private String titrePrestation;
	@Column(length = 30, nullable = true)
	private String descPrestation;
	@Column(length = 30, nullable = true)
	private String adressePrestation;
	@Column(length = 30, nullable = true)
	private int notePrestation;

	@ManyToOne
	@JoinColumn(name="ID_RESERVATION")
	private TicketResa ticketResa;
	
	@ManyToOne 
	@JoinColumn(name="PROVINCE_NAME", nullable = true)
	private Province province;
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_NAME", nullable = true)
	private CategoriePrestation categoriePrestation;
	
	@Column(length = 30, nullable = true)
	@OneToMany(mappedBy = "prestation")
	private Collection<Planning>plannings;

	@ManyToOne
	@JoinColumn(name="ID_ACTIVITY_OWNER", nullable = true)
	private Partenaire partenaire;
}
