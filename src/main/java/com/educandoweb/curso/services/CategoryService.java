package com.educandoweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.entities.Category;
import com.educandoweb.curso.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> finAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = Optional.empty();
		return obj.get();
	}
}
