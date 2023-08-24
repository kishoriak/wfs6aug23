package com.demo.beans;

import com.demo.exceptions.InsufitientBalanceException;

public class CurrentAccount extends Account{
	public int numTransaction;
	public static float int_rate;
	public static double min_bal;
	static {
	   int_rate=0.04f;
	   min_bal=20000;
	  }
	public CurrentAccount() {
		super();
	}
	public CurrentAccount(User[] user, double balance,int numTransaction) {
		super(user,balance);
		this.numTransaction = numTransaction;
	}
	public int getNumTransaction() {
		return numTransaction;
	}
	public void setNumTransaction(int numTransaction) {
		this.numTransaction = numTransaction;
	}
	@Override
	public void withdraw(double amt) throws InsufitientBalanceException {
		if(balance-amt>=min_bal) {
			balance=balance-amt;
		}
		else {
			throw new InsufitientBalanceException("insuffitient balance");
		}
		
	}
	@Override
	public String toString() {
		return super.toString()+"CurrentAccount [numTransaction=" + numTransaction + "]";
	}	
	

}
