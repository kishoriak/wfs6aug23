package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exceptions.EmployeeNotFound;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeArraList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("1. add new employee\n2.modifysal\n"
					+ "3. search by id\n +4. search by name\n 5. delete by id\n"
					+ "6. sort by sal\n 7. display all\n 8.exit\n choice: ");
			 choice=sc.nextInt();
			switch(choice) {
			case 1:
				eservice.addnewEmployee();
				break;
			case 3:
				System.out.println("enetr new id");
				int id=sc.nextInt();
				
				Employee emp;
				try {
					emp = eservice.serachById(id);
					if(emp!=null) {
						System.out.println(emp);
					}
				} catch (EmployeeNotFound e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("enter name");
				String nm=sc.nextLine();
				List<Employee> elist=eservice.searchByName(nm);
				if(elist!=null)
					elist.forEach(System.out::println);
				else {
					System.out.println("not found");
				}
			case 5:
				System.out.println("enetr new id");
				id=sc.nextInt();
				boolean status=eservice.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
				}
				else {
					System.out.println("not found");
				}
				
			case 7:
				 elist=eservice.getAll();
				//java 1.7
				/*for(Employee e:elist) {
					System.out.println(e);
				}*/
				//java 1.8
				//elist.forEach(emp->System.out.println(emp));
				elist.forEach(System.out::println);
				break;
			case 8:
				sc.close();
				System.out.println("Thank you for visiting...");
			}
		}while(choice!=8);

	}

}
