package com.seekngo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriePrestation implements Serializable{

	@Id
	private String  CategoryName;
}
