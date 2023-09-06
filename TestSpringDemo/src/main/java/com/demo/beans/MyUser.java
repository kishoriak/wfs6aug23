package com.demo.beans;

public class MyUser {
	private int uid;
	private String uname;
	private String mobile;
	private Address address;
	public MyUser() {
		super();
		System.out.println("in user default constructor");
	}
	
	public MyUser(int uid, String uname, String mobile, Address address) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.mobile = mobile;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
		System.out.println("in user uid setter");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("in user uname setter");
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
		System.out.println("in user mobile setter");
	}

	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	

}
