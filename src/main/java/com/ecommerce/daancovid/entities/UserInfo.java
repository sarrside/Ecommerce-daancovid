package com.ecommerce.daancovid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
@SuppressWarnings("unused")
public class UserInfo {
	@Id
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String adresse;
	private User user;
}
