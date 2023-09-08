package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService pservice;
	
	@GetMapping("/viwproducts")
	public ModelAndView viewAllProducts() {
		List<Product> plist=pservice.getAll();
		return new ModelAndView("displayProduct","plist",plist);
	}

}
