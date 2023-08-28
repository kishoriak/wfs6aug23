package com.demo.test;

import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exceptions.NoEmployeeFound;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeManagement {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		System.out.println("Map\nList\nSet\n");
		String ch=sc.next();
		EmployeeService employeeService=new EmployeeServiceImpl(ch);
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2.Delete employee\n3.modify Employee\n ");
		System.out.println("4. search by Id\n5.search By Name\n6.display all\n ");
		System.out.println("7. sort By name\n8.sort by sal based on pattern \n9.exit\n ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			employeeService.addnewEmployee();
			break;
		case 2:
			System.out.println("enetr id");
			int id=sc.nextInt();
			boolean status=employeeService.deleteEmployee(id);
			if(status) {
				System.out.println("deleted done");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enetr id");
			id=sc.nextInt();
			System.out.println("enter new name");
			String nm=sc.next();
			System.out.println("enter new sal");
			double sal=sc.nextDouble();
			
			try {
				status = employeeService.modifyEmployee(id,nm,sal);
				if(status)
				{
					System.out.println("modification done");
				}
			} catch (NoEmployeeFound e1) {
				System.out.println("not found");
				e1.printStackTrace();
			}
			
			
			
			break;
		case 4:
			System.out.println("enter id");
			id=sc.nextInt();
			try {
				Employee ob= employeeService.searchById(id);
				System.out.println(ob);
			}catch(NoEmployeeFound e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case 5:
			System.out.println("enetr name");
			String name=sc.next();
			try {
			  List<Employee> elist=employeeService.findByName(name);
			  for(Employee e:elist) {
				  System.out.println(e);
			  } 
			}catch(NoEmployeeFound e) {
				System.out.println(e.getMessage());
			}
			break;
		case 6:
			Collection<Employee> elist=employeeService.findAll();
			if(elist!=null) {
			for(Employee e:elist) {
				System.out.println(e);
			}
			}
			else {
				System.out.println("No employee are available");
			}
			
			break;
		case 7:
			elist=employeeService.sortByName();
			for(Employee e:elist) {
				System.out.println(e);
			}
			break;
		case 8:
			//find all names with pattern and sort them by sal
			System.out.println("enter patteren");
			String pattern=sc.next();
			Collection<Employee> pq=employeeService.sortByPatternUsingSal(pattern);
			if(pq!=null)
				for(Employee e:pq) {
					System.out.println(e);
				}
			else{
				System.out.println("Pattern not found");
			}
			break;
		case 9:
			//System.exit(0);
			System.out.println("Thank you for using system, Visit again.....");
		
		}
		}while(choice!=9);
		long end=System.currentTimeMillis();
		System.out.println("execution time : "+(start-end));
	}

}
