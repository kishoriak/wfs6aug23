package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myprodtab22")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	
	
	private String pname;
	private int qty;
	private double price;
	
	public Product() {
		super();
	}

	public Product(String name, int qty, double price) {
		super();
		//this.pid = pid;
		this.pname = name;
		this.qty = qty;
		this.price = price;
	}
	public Product(int pid, String name, int qty, double price) {
		super();
		this.pid = pid;
		this.pname = name;
		this.qty = qty;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String name) {
		this.pname = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + pname + ", qty=" + qty + ", price=" + price + "]";
	}
	

}
