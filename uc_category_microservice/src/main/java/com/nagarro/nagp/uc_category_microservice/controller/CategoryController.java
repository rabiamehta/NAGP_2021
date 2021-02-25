package com.nagarro.nagp.uc_category_microservice.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.uc_category_microservice.model.Category;
import com.nagarro.nagp.uc_category_microservice.service.CategoryService;
import com.nagarro.nagp.uc_category_microservice.exception.RecordNotFoundException;

@RestController
@RequestMapping("categories")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/")
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@PostMapping(value="/addCategory")
	public String addCategory(@Validated @RequestBody Category category) {
		categoryService.addCategory(category);
		return "Category Added Successfully !";
	}
	
	@GetMapping(value="/getCategoryById/{categoryId}")
	public Category getCategoryByID(@PathVariable int categoryId) {
		Category category = categoryService.getCategoryById(categoryId);
		if (category == null) {
			throw new RecordNotFoundException("Category Id " + categoryId +" does not exist !" );
		} else {
			return category;
		}
	}
	
	@DeleteMapping(value="/removeCategory")
	public String removeCategory(@PathParam(value = "categoryId") int categoryId) {
		Category category = getCategoryByID(categoryId);
		categoryService.removeCategory(category);
		return "Category removed !";
	}
}
