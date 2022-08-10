package com.seekngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seekngo.entities.CategoriePrestation;
import com.seekngo.entities.Prestation;
import com.seekngo.entities.Province;
import com.seekngo.service.CategoriePrestationService;
import com.seekngo.service.PrestationService;
import com.seekngo.service.ProvinceService;

@RequestMapping("/prestation")
@RestController
public class PrestationController {
	@Autowired
	private PrestationService prestationService;
	

	
	@GetMapping("/list")
	public Iterable<Prestation> getPrestation(){
		return prestationService.listAll();
	}
	

}
