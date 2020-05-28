package com.ecommerce.daancovid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
@SuppressWarnings("unused")
public class Payment {
	@Id
	private String id;
	private String paymentCurrency;
	private Double amount;

}
