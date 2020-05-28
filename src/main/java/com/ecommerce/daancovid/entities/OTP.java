package com.ecommerce.daancovid.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
@SuppressWarnings("unused")
public class OTP {
	private String associatedPhoneNumber;
	private String code;
}
