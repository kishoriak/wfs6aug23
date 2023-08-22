package com.demo.beans;

public class User {
	
	private String fname,lname;
	private String mobile,email;
	public User() {
		super();
	}
	public User(String fname, String lname, String mobile, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	
}
