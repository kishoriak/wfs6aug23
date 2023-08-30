package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeManagementJDBC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService employeeService=new EmployeeServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2.Delete employee\n3.modify Employee\n ");
		System.out.println("4. search by Id\n5.search By Name\n6.display all\n ");
		System.out.println("7. sort By sal\n8.sort by sal based on type \n9.exit\n ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status=employeeService.addNewEmployee();
			if(status) {
				System.out.println("added");
			}
			else {
				System.out.println("not added");
			}
			break;
		case 2:
			System.out.println("enter id");
			int id=sc.nextInt();
			status=employeeService.deleteById(id);
			if(status) {
				System.out.println("deleted");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enter id");
			id=sc.nextInt();
			System.out.println("enter name");
			String nm=sc.next();
			System.out.println("enter salary");
			double charges=sc.nextDouble();
			status=employeeService.modifyEmployee(id,nm,charges);
			if(status) {  //status==true
				System.out.println("modified successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("enter id");
			id=sc.nextInt();
			Employee e=employeeService.searchById(id);
			if(e!=null) {
				System.out.println(e);
			}
			else {
				System.out.println(" not found");
			}
			break;
		case 6:
			List<Employee> emplist=employeeService.findAll();
			for(Employee e1:emplist) {
				
				if(e1!=null)
				  System.out.println(e1);
				else
					break;
			}
			break;
		case 7:
			List<Employee> elist1=employeeService.sortBySal();
			for(Employee e1:elist1) {
				  System.out.println(e1);
			
			}
			break;
		case 9:
			employeeService.closeConnection();
			//System.exit(0);
			System.out.println("Thank you for using system, Visit again.....");
		
		}
		}while(choice!=9);
		
	}

}
