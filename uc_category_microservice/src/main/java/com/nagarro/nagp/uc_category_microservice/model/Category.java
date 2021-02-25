package com.nagarro.nagp.uc_category_microservice.model;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Category implements Serializable{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int categoryId;
	
	private String categoryName;
}
