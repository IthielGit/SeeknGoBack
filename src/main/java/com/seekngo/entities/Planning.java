package com.seekngo.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Planning implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private String heureDispos;
	
	@ManyToOne
	@JoinColumn(name="ID_PRESTATION",nullable = true)
	private Prestation prestation;
}
