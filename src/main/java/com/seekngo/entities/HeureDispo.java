package com.seekngo.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="HeureDispo")
@Data @NoArgsConstructor @AllArgsConstructor
public class HeureDispo implements Serializable{
	@Id
	private String heure;
	@ManyToOne
	@JoinColumn(name="ID_PLANNING",nullable = true )
	private Planning planning;
}
