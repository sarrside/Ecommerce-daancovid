package com.ecommerce.daancovid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
@SuppressWarnings("unused")
public class Product {
	@Id
	private String id ;
	private String name;
	private String description;
	private Boolean promo; 
	private Double promo_price;
	private Double price;
	private String image;
	private Category category;
}
