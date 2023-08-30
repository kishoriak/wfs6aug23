package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable,Comparable<Employee>{
	private int empid;
	private String ename;
	private double sal;
	public Employee() {
		super();
	}
	
	public Employee(int id) {
		this(id,null,0);
	}
	public Employee(int empid, String ename, double sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	public int hashCode() {
		System.out.println("in hashscode method");
		//return empid+ename.hashCode();
		return empid;
	}
	public boolean equals(Object ob) {
		System.out.println("in equals of employee");
		Employee e=(Employee)ob;
		//if(this.empid!=e.empid && !ename.equals(e.ename)) {
		if(this.empid!=e.empid) {
			return false;
		}
		return true;
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
		System.out.println("in employee compareTo");
		return this.ename.compareTo(o.ename);
	}
	

}
