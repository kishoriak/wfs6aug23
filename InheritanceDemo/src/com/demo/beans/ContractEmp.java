package com.demo.beans;

public class ContractEmp extends Employee{
	private int hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int perId, String pname, String mobile,String dept, String desg,int hrs, double charges) {
		super(perId,pname,mobile,dept,desg);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	@Override
	public double calcSal() {
		return hrs*charges;
	}
	

}
