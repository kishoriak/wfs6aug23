package com.demo.beans;

public class Person {
	private int perId;
	private String pname;
	private String mobile;
	//default constructor
	public Person() {
		System.out.println("in person default constructor");
		this.perId = 0;
		this.pname = null;
		this.mobile = null;
	}
	public Person(int perId, String pname, String mobile) {
		
		System.out.println("in person parametrized constructor");
		this.perId = perId;
		this.pname = pname;
		this.mobile = mobile;
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", pname=" + pname + ", mobile=" + mobile + "]";
	}
	
	
	

}
