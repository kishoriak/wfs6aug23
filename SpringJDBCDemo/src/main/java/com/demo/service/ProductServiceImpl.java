package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Override
	public int addProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int id=sc.nextInt();
		System.out.println("enetr name");
		String nm=sc.next();
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		double price=sc.nextDouble();
		Product p=new Product(id,nm,qty,price);
		return productDao.save(p);
	}

	@Override
	public List<Product> displayAll() {
		return productDao.findAll();
	}

	@Override
	public Product getById(int id) throws EmptyResultDataAccessException{
		return productDao.getById(id);
	}

	@Override
	public List<Product> getByPrice(double lpr, double hpr) {
		return productDao.getByPrice(lpr,hpr);
	}

	@Override
	public boolean deleteById(int id) {
		return productDao.deleteByID(id);
	}

	@Override
	public int updateById(int id, int qty, double pr) {
		return productDao.updateByID(id,qty,pr);
	}

}
