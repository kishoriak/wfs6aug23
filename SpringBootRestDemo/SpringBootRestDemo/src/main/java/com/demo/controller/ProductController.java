package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Product;
import com.demo.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	ProductService pservice;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return pservice.getAll();
	}

}
