package com.seekngo.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seekngo.entities.Prestation;
import com.seekngo.repository.PrestationRepository;



@Service
public class PrestationService {
	@Autowired
	private PrestationRepository prestationRepository;

	public Iterable<Prestation> listAll() {
		return this.prestationRepository.findAll();
	}
	
	public void savePrestation(Prestation p) throws IOException {
		Prestation prestation = new Prestation();
		prestation.setTitrePrestation(p.getTitrePrestation());
		prestation.setDescPrestation(p.getDescPrestation());
		prestation.setAdressePrestation(p.getAdressePrestation());
		prestation.setNotePrestation(p.getNotePrestation());
		prestation.setProvince(p.getProvince());
		prestation.setCategoriePrestation(p.getCategoriePrestation());
		
		String imagePath = p.getProfileImageUrl();
		File file = new File(imagePath);
		byte[] picInBytes = new byte[(int) file.length()];
	    FileInputStream fileInputStream = new FileInputStream(file);
	    fileInputStream.read(picInBytes);
	    fileInputStream.close();
	    prestation.setImagePrestation(picInBytes);
	    
		prestationRepository.save(prestation);
	}

	public Prestation getPrestationByID(long id) {
		return prestationRepository.findById(id).get();
	}

	public void updatePrestation(Prestation p, int id) throws IOException {
		Prestation prestation = new Prestation();
		prestation.setTitrePrestation(p.getTitrePrestation());
		prestation.setDescPrestation(p.getDescPrestation());
		prestation.setAdressePrestation(p.getAdressePrestation());
		prestation.setNotePrestation(p.getNotePrestation());
		prestation.setProvince(p.getProvince());
		prestation.setCategoriePrestation(p.getCategoriePrestation());
		
		String imagePath = p.getProfileImageUrl();
		File file = new File(imagePath);
		byte[] picInBytes = new byte[(int) file.length()];
	    FileInputStream fileInputStream = new FileInputStream(file);
	    fileInputStream.read(picInBytes);
	    fileInputStream.close();
	    prestation.setImagePrestation(picInBytes);
	    
		prestationRepository.save(prestation);
	}

	public void deletePrestation(long id) {
		prestationRepository.deleteById(id);
	}

}
