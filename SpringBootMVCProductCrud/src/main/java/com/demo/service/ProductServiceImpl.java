package com.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Override
	public Product addProduct(Product p) {
		
		return productDao.save(p);
	}

	@Override
	public List<Product> displayAll() {
		int num=productDao.getCount();
		System.out.println("count : "+num);
		return productDao.findAll();
	}

	@Override
	public Optional<Product> getById(int id) throws EmptyResultDataAccessException{
		Optional<Product> op=productDao.findById(id);
		//if(op.isPresent()) {
			System.out.println(op);
		return Optional.ofNullable(op.get());
			
		/*}else {
			return null;
			//throw new ResourceNotFoundException("product","pid",id)
		}*/
	}

	@Override
	public List<Product> getByPrice(double lpr, double hpr) {
		List<Product> plist=productDao.getByPrice(lpr,hpr);
		System.out.println("Size: "+plist.size());
		return plist;
		
	}

	@Override
	public void deleteById(int id) {
		productDao.deleteById(id);
	}

	@Override
	public int updateById(Product p) {
		Optional<Product> p1=productDao.findById(p.getPid());
		if(p1.isPresent()) {
			Product p2=p1.get();
			p2.setPname(p.getPname());
			p1.get().setPrice(p.getPrice());
			p2.setQty(p.getQty());
			productDao.save(p2);
			return 1;
		}
		else {
			return 0;
		}
	}

}
