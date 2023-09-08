package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;


@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{
	@Query(value="select * from myprodtab22 where price between :lpr and :hpr",nativeQuery=true)
	//@Query(value="select p from Product p where price between :lpr and :hpr")
	public List<Product> getByPrice(double lpr,double hpr);
	
	@Procedure(procedureName="getNumProducts")
	public int getCount();
}
