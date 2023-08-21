package com.demo.beans;

public class SalariedEmp extends Employee{
	private double basicSal;
	private double bonus;
	
	//default constructor
	public SalariedEmp() {
		super();
	}
	//parametrised constructor
	public SalariedEmp(int perId, String pname, String mobile,String dept, String desg,double basicSal) {
		super(perId,pname,mobile,dept,desg);
		this.basicSal = basicSal;
		this.bonus = basicSal*0.10;
	}
	//setter and getter methods
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [basicSal=" + basicSal + ", bonus=" + bonus + "]";
	}
	
	@Override
	public double calcSal() {
		return basicSal+basicSal*0.15+basicSal*0.18-basicSal*0.10+bonus;
	}
	
	public double calBonus(int apraisalrate) {
		return basicSal*(apraisalrate*0.10);
		
	}
	 
	

}
