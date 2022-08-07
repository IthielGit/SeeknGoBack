package com.seekngo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "CategoriePrestation")
public class CategoriePrestation implements Serializable{

	@Id
	private String  CategoryName;
}
