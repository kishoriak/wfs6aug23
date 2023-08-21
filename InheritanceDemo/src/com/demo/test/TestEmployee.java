package com.demo.test;

import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;


public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. SalariedEmp \n 2. ContractEmp \n Choice :");
		int choice=sc.nextInt();
		Employee e=null;
		switch(choice) {
		case 1:
			e=new SalariedEmp(12,"Rajan","33333","HR","manager",34567);
		    //System.out.println(e);
		    //System.out.println(e.calcSal());
			
		    break;
		case 2:
			e=new ContractEmp(12,"Rajan","33333","HR","manager",34,3000);
		    //System.out.println(e);
		    //System.out.println(e.calcSal());
		    break;
		}
		System.out.println(e);
	    System.out.println(e.calcSal());
	    if(e instanceof SalariedEmp)
	       System.out.println(((SalariedEmp)e).calBonus(3));
	    

	}

}
