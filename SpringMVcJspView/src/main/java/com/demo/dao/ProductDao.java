package com.demo.dao;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.demo.beans.Product;

public interface ProductDao {

	int save(Product p);

	List<Product> findAll();

	Product getById(int id) throws EmptyResultDataAccessException;

	List<Product> getByPrice(double lpr, double hpr);

	boolean deleteByID(int id);

	int updateByID(Product p);

}
