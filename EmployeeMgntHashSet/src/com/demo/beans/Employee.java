package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable,Comparable<Employee>{
	private int empid;
	private String ename;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, double sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	public Employee(int empid) {
		super();
		this.empid = empid;
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode called "+empid);
		return empid;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called "+empid+"----"+((Employee)obj).empid);
		return this.empid==((Employee)obj).empid;
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
	@Override
	public int compareTo(Employee o) {
		if(this.empid<o.empid) {
			return -1;
		}
		else if(this.empid==o.empid) {
			return 0;
		}
		else {
			return 1;
		}
	}
	

}
