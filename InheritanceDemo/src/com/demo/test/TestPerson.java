package com.demo.test;
import com.demo.beans.*;
//import com.demo.beans.SalariedEmp;

public class TestPerson {

	public static void main(String[] args) {
		//Person p=new Person(12,"Raj","2222");
		//System.out.println(p);
		//Employee e1=new Employee(12,"Rajan","33333","HR","manager");
       // System.out.println(e1);
		SalariedEmp e1=new SalariedEmp(12,"Rajan","33333","HR","manager",34567);
	    System.out.println(e1);
	    System.out.println(e1.calcSal());
	    ContractEmp c1=new ContractEmp(12,"Rajan","33333","HR","manager",34,3000);
	    System.out.println(c1);
	    System.out.println(c1.calcSal());
	}

}
