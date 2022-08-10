package com.seekngo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seekngo.entities.CategoriePrestation;
import com.seekngo.repository.CategoriePrestationRepository;

@Service
public class CategoriePrestationService {
	@Autowired
	private CategoriePrestationRepository categoriePrestationRepository;
	
	public Iterable<CategoriePrestation> listAll() {
		return this.categoriePrestationRepository.findAll();
	}

	public void saveCategoriePrestation(CategoriePrestation categoriePrestation) {
		categoriePrestationRepository.save(categoriePrestation);
	}

	public CategoriePrestation getCategoriePrestationByID(long id) {
		return categoriePrestationRepository.findById(id).get();
	}

	public void updateCategoriePrestation(CategoriePrestation categoriePrestation, int id) {
		categoriePrestationRepository.save(categoriePrestation);
	}

	public void deleteCategoriePrestation(long id) {
		categoriePrestationRepository.deleteById(id);
	}
}
