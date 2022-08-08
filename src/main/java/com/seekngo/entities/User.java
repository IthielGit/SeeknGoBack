package com.seekngo.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.apache.el.parser.AstFalse;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "userType",
discriminatorType = DiscriminatorType.STRING,
length =15 )
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	@Column(length = 30, unique = true, nullable = true)
	private String email;
	@Column(length = 15,nullable = true)
	private String password;
	@Column(length = 15,nullable = true)
	private String numTel;
	@Column(length = 30,nullable = true)
	private String adresse;
	
	@OneToOne
	@JoinColumn(name="authority_id")
	private Authority authority;
}
