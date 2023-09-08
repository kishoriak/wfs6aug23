package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	void save(Product p);

	List<Product> findAll();

	int removeById(int pid);

	Product findById(int pid);

	int updateById(int pid, String pname, int qty, double pr);

}
