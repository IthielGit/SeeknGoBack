package com.seekngo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class HeureDispo implements Serializable{
	@Id
	private String heure;
	@ManyToOne
	@JoinColumn(name="ID_PLANNING")
	private Planning planning;
}
