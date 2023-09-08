package com.demo.service;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.demo.beans.Product;

public interface ProductService {

	int addProduct();

	List<Product> displayAll();

	Product getById(int id) throws EmptyResultDataAccessException;

	List<Product> getByPrice(double lpr, double hpr);

	boolean deleteById(int id);

	int updateById(int id, int qty, double pr);

}
