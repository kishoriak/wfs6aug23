package com.demo.beans;

import java.util.Arrays;

public class Account {
	private static int  cnt;
	static {
		cnt=0;
	}
	private String generateId() {
		String fnm,lnm;
		if(user[0]==null) {
			 fnm="xyz";
			 lnm="pqr";
		}
		else {
		   fnm=user[0].getFname().substring(0,3);
		   lnm=user[0].getLname().substring(0,3);
		}
		cnt++;
		return fnm+lnm+cnt;
	}
	private String id;
	private User[] user;
	protected double balance;
	public Account() {
		super();
		id=generateId();
	}
	public Account( User[] user, double balance) {
		super();
		
		this.user = user;
		this.balance = balance;
		this.id = generateId();
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Account.cnt = cnt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User[] getUser() {
		return user;
	}
	public void setUser(User[] user) {
		this.user = user;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", user=" + Arrays.toString(user) + ", balance=" + balance + "]";
	}
	
}
