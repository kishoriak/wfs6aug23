package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;

	public void addnewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product id");
		int pid=sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double price=sc.nextDouble();
		Product p=new Product(pid,pname,qty,price);
		productDao.save(p);
	}

	@Override
	public List<Product> getAll() {
		return productDao.findAll();
	}

	@Override
	public int deleteById(int pid) {
		//return productDao.removeById(pid);
		return 0;
	}

	@Override
	public Product getById(int pid) {
		//return productDao.findById(pid);
		return null;
	}

	@Override
	public int modifyById(int pid, String pname, int qty, double pr) {
		//return productDao.updateById(pid,pname,qty,pr);
		return 0;
	}

}
