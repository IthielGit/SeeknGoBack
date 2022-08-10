package com.seekngo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seekngo.entities.Province;
import com.seekngo.repository.ProvinceRepository;

@Service
public class ProvinceService {
	@Autowired
	private ProvinceRepository provinceRepository;
	
	public Iterable<Province> listAll() {
		return this.provinceRepository.findAll();
	}

	public void saveProvince(Province province) {
		provinceRepository.save(province);
	}

	public Province getProvinceByID(long id) {
		return provinceRepository.findById(id).get();
	}

	public void updateProvince(Province province, int id) {
		provinceRepository.save(province);
	}

	public void deleteProvince(long id) {
		provinceRepository.deleteById(id);
	}
}
