package com.ecommerce.daancovid.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
@SuppressWarnings("unused")
public class Category {
	@Id
	private String id;
	private String name;
	private String description;
	private String image;
}
