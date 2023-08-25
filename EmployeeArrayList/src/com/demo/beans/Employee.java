package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable{
	private int empid;
	private String ename;
	private double sal;

	public Employee() {
		super();
	}
	public boolean equals(Object ob) {
		System.out.println("Equals called "+this.empid+"  "+((Employee)ob).empid);
		return this.empid==((Employee)ob).empid;
				//&& this.ename.equals(((Employee)ob).ename);
	}
	public Employee(int empid) {
		super();
		this.empid = empid;
	}

	public Employee(int empid, String ename, double sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

}
