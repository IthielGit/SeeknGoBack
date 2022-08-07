package com.seekngo.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("Admin")
public class Admin extends User {
	@Column(length = 10,nullable = true)
    private String poste;

    //manually generated (not using lombok in this constructor)
    public Admin(Long idUser, String email, String numTel, String adresse, String password, String poste) {
        super(idUser, email, numTel, adresse, password);
        this.poste = poste;
    }


}
