package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;

import com.demo.beans.Product;

public interface ProductService {

	Product addProduct(Product p);

	List<Product> displayAll();

	Optional<Product> getById(int id) throws EmptyResultDataAccessException;

	//List<Product> getByPrice(double lpr, double hpr);

	void deleteById(int id);

	int updateById(Product p);

	List<Product> getByPrice(double lpr, double hpr);

}
