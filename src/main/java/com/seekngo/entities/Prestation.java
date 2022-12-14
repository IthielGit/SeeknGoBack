package com.seekngo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data 
@NoArgsConstructor 
@AllArgsConstructor
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

	@Lob
	@Column(name="PROFILE_PRESTATION", nullable = true)
	private byte[] imagePrestation;
	
//	@Column(nullable = true)
//	private String profileImageUrl;
	
//	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	@JsonIgnore
//	@JoinColumn(name="ID_RESERVATION", nullable = true)
//	private TicketResa ticketResa;
	
	@ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="PROVINCE_NAME", nullable = false)
	private Province province;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="CATEGORY_NAME", nullable = false)
	private CategoriePrestation categoriePrestation;
	

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="ID_ACTIVITY_OWNER", nullable = true, referencedColumnName = "idUser")
	private Partenaire partenaire;
	
	
}
