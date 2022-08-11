package com.seekngo.entities;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class OptionPrestation {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOption;
	
	@Column(length = 30, nullable = true)
	private String titreOption;
	
	@Column(length = 30, nullable = true)
	private String tarifOption;
	
	@Column(length = 30, nullable = true)
	private String uniteDeComptage;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="ID_PRESTATION",nullable = true)
	private Prestation prestation;
}
