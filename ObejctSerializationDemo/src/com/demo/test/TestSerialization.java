package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestSerialization {

	public static void main(String[] args) {
		EmployeeService eservice=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		eservice.readFile();
		do {
		     System.out.println("1. add new employee\n"
		     		+ "2. search employee by id\n"
		     		+ "3. display all\n "
		     		+ "4. exit\n choice:");
		     choice=sc.nextInt();
		     switch(choice) {
		     case 1:
		    	 eservice.addNewEmployee();
		    	 break;
		     case 3:
		    	 Employee[] arr=eservice.getAll();
		    	 for(Employee e:arr) {
		    		 if(e==null) {
		    			 break;
		    		 }
		    		 System.out.println(e);
		    		 
		    	 }
		    	 break;
		     case 4:
		    	 eservice.writeFile();
		    	 sc.close();
		    	 System.out.println("Thankyou for visiting.....");
		     }
		}while(choice!=4);
		

	}

}
