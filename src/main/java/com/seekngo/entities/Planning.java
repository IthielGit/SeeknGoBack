package com.seekngo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Planning implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlanning;
	@Column(length = 30, nullable = true)
	private String titrePlanning;
	@Column(length = 30, nullable = true)
	private String tarifPlanning;
	@Column(length = 30, nullable = true)
	private String uniteDeComptage;
	@Column(length = 30, nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date datePlanning;
	@Column(nullable = true)
	@OneToMany(mappedBy = "planning")
	private Collection<HeureDispo>heureDispos;
	
	@ManyToOne
	@JoinColumn(name="ID_PRESTATION",nullable = true)
	private Prestation prestation;
}
