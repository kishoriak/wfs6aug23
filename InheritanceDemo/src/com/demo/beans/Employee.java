package com.demo.beans;

public abstract class Employee extends Person{
	private String dept,desg;
	
	public Employee() {
		System.out.println("in employee default constructor");
		this.dept = null;
		this.desg =null;
		//this(0,null,null);
	}

	public Employee(int perId, String pname, String mobile,String dept, String desg) {
		//call parametrized constructor of parent
		super(perId,pname,mobile);
		System.out.println("in employee parametrized constructor");
		this.dept = dept;
		this.desg = desg;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}
    abstract public double calcSal();
    
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	
	
	

}
