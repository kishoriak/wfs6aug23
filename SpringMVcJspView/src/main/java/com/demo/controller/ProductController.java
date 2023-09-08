package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService pservice;
	
	@GetMapping("/viewProducts")
	public ModelAndView getAllProducts() {
		 List<Product> plist= pservice.displayAll();
		return new ModelAndView("displayProduct","plist",plist);
		
	}
	
	
	
	@GetMapping("/addproduct")
	public String addProduct() {
		return "addproductdetails";
	}
	
	@PostMapping("/saveProduct")     
	public ModelAndView saveproduct(@RequestParam int pid, @RequestParam String pname,@RequestParam  int pqty ,@RequestParam double pr) {
		Product p=new Product(pid,pname,pqty,pr);
		pservice.addProduct(p);
		return new ModelAndView("redirect:/product/viewProducts");
		
	}
	
	@GetMapping("/deleteProduct/{pid}")
	public ModelAndView deleteProduct(@PathVariable int pid) {
		pservice.deleteById(pid);
		return new ModelAndView("redirect:/product/viewProducts");
		
	}
	
	@GetMapping("/updateProduct")
	public ModelAndView updateProduct(@RequestParam int pid, @RequestParam String pname,@RequestParam int qty,@RequestParam double price) {
		Product p=new Product(pid,pname,qty,price);
		pservice.updateById(p);
		return new ModelAndView("redirect:/product/viewProducts");
		
	}
	@PostMapping("/editProduct/{pid}")
	public ModelAndView editProduct(@PathVariable("pid") int p,@RequestParam int pid) {
		System.out.println("pid vis RequestParam : "+pid);
		Product prod=pservice.getById(p);
		return new ModelAndView("editProduct","prod",prod);
		
	}
	
	
	

}
