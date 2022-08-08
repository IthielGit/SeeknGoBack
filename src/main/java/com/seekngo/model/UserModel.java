package com.seekngo.model;

import com.seekngo.entities.Authority;

import lombok.Data;

@Data
public class UserModel {
	private String email;
	private String password;
	private Authority authority;
	
}
