package com.nagarro.nagp.uc_category_microservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.nagp.uc_category_microservice.model.Category;
import com.nagarro.nagp.uc_category_microservice.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	List<Category> categories = new ArrayList<>();
	
	public CategoryServiceImpl() {
		this.categories.add(new Category(1, "Electrician"));
		this.categories.add(new Category(2, "Yoga Trainer"));
		this.categories.add(new Category(3, "Plumber"));
	}
	
	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

	@Override
	public void addCategory(Category category) {
		categories.add(category);
	}

	@Override
	public Category removeCategory(Category category) {
		categories.remove(category);
		return category;
	}

	@Override
	public Category getCategoryById(int categoryId) {
		for (Category c : categories) {
			if (c.getCategoryId() == categoryId) {
				return c;
			}
		}
		return null;
	}

}
