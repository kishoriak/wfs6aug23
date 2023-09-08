package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

	

}
