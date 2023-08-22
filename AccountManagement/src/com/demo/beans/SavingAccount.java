package com.demo.beans;

public class SavingAccount extends Account{
   public String chequebknum;
   public static float int_rate;
   public static double min_bal;
   static {
	   int_rate=0.04f;
	   min_bal=20000;
   }
   public SavingAccount() {
		super();
   }
	public SavingAccount(User[] user, double balance,String chequebknum) {
		super(user,balance);
		this.chequebknum = chequebknum;
	}
	public String getChequebknum() {
		return chequebknum;
	}
	public void setChequebknum(String chequebknum) {
		this.chequebknum = chequebknum;
	}
	@Override
	public String toString() {
		return super.toString()+"SavingAccount [chequebknum=" + chequebknum + "]";
	}
	
	
   
   
   
   
}
