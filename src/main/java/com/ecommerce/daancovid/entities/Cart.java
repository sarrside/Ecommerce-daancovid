package com.ecommerce.daancovid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
@SuppressWarnings("unused")
public class Cart {
	@Id
	private Integer id;
	private int quantity;
	private Double amount;
	private Double price;
	private Product product;
	private Order order;
}
