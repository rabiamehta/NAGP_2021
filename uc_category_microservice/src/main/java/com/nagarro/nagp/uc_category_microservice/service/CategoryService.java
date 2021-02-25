package com.nagarro.nagp.uc_category_microservice.service;

import java.util.List;
import com.nagarro.nagp.uc_category_microservice.model.Category;

public interface CategoryService {
	
	public List<Category> getAllCategories();
	public void addCategory(Category category);
	public Category removeCategory(Category category);
	public Category getCategoryById(int categoryId);
}
