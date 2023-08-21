package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.service.EmployeeService;

public class TestEmpArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n 2. modify emp salary \n 3. search employee by id\n");
		System.out.println("4. display All\n 5. display first 2 SalariedEmp \n 6. display all contract employee\n");
		System.out.println("7. exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. SalriedEmp \n 2. ContractEmp \n choice: ");
			int ch=sc.nextInt();
			EmployeeService.addnewEmployee(ch);
			break;
		case 2:
			System.out.println("enter emp id to modify sal");
			int id=sc.nextInt();
			System.out.println("enter new salary");
			double sal=sc.nextDouble();
			boolean status=EmployeeService.modifySal(id,sal);
			if(status) {
				System.out.println("modification done successfully");
			}
			else {
				System.out.println("employee with id "+id+ " not found ");
			}
			
		case 4:
			Employee[] arr=EmployeeService.displayAll();
			for(Employee e:arr) {
				if(e==null) {
					break;
				}
				else {
					System.out.println(e);
				}
			}
		case 5:
			 arr=EmployeeService.findTwoSalariedEmp();
			 if(arr!=null)
				 for(Employee e:arr) {
					 System.out.println(e);
				 }
			 else
				 System.out.println("less number of salaried emp");
		case 6:
			arr=EmployeeService.findAllContractEmp();
			if(arr!=null) {
				for(Employee e:arr) {
					System.out.println(e);
				}
			}
			else {
				System.out.println("no contract employees are found");
			}
			
		case 7:
			System.out.println("Thank you for visiting....");
			sc.close();
			break;
		default:
			System.out.println("wrong choice");
				
		}
		}while(choice!=7);
	}

}
