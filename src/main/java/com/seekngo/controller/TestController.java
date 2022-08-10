package com.seekngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seekngo.entities.CategoriePrestation;
import com.seekngo.entities.Province;
import com.seekngo.entities.User;
import com.seekngo.service.CategoriePrestationService;
import com.seekngo.service.ProvinceService;
import com.seekngo.service.UserService;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private CategoriePrestationService categoriePrestationService;
	
	@Autowired
	private ProvinceService provinceService;
	
	
	@GetMapping("/categorieList")
	public Iterable<CategoriePrestation> getCategoriePrestation(){
		return categoriePrestationService.listAll();
	}
	
	@GetMapping("/provinceList")
	public Iterable<Province> getProvince() {
		return provinceService.listAll();
	}

}
