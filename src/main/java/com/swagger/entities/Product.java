package com.swagger.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer contactId;
	
	private String contactName;
	
	private String contactEmail;

}

