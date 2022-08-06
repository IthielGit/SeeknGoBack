package com.seekngo.entities;

import java.io.Serializable;
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
public class Prestation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestation;
	private String titrePrestation;
	private String descPrestation;
	private String adressePrestation;
	private int notePrestation;
	@ManyToOne
	@JoinColumn(name="ID_RESERVATION")
	private TicketResa ticketResa;
	@ManyToOne
	@JoinColumn(name="PROVINCE_NAME")
	private Province province;
	@ManyToOne
	@JoinColumn(name="CATEGORY_NAME")
	private CategoriePrestation categoriePrestation;
	@OneToMany(mappedBy = "prestation")
	private Collection<Planning>plannings;
	@ManyToOne
	@JoinColumn(name="ID_ACTIVITY_OWNER")
	private Partenaire partenaire;
}
