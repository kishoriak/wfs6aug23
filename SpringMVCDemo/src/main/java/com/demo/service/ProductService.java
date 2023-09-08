package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void addnewProduct();

	List<Product> getAll();

	int deleteById(int pid);

	Product getById(int pid);

	int modifyById(int pid, String pname, int qty, double pr);

}
