package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestJDBCDemo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext
				                  ("applicationcontext.xml");
		ProductService pservice=(ProductService)ctx.getBean("productServiceImpl");
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. Add product\n2. delete product\n3. modify product\n");
		System.out.println("4. Display all\n5. Display by id\n6. exit\n");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			pservice.addnewProduct();
			break;
		case 2:
			System.out.println("enetr pid");
			int pid=sc.nextInt();
			int n=pservice.deleteById(pid);
			if(n>0) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enetr pid");
			 pid=sc.nextInt();
			 System.out.println("enetr qty");
			 int qty=sc.nextInt();
			 System.out.println("enetr price");
			 double pr=sc.nextDouble();
			 System.out.println("enetr name");
			 String pname=sc.next();
			 n=pservice.modifyById(pid,pname,qty,pr);
			 if(n>0) {
				System.out.println("modified successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
			
		case 4:
			List<Product> plist=pservice.getAll();
			plist.forEach(System.out::println);
			break;
		case 5:
			System.out.println("enetr pid");
			pid=sc.nextInt();
			Product p=pservice.getById(pid);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 6:
			System.out.println("Thank you for visiting....");
			sc.close();
		}
			
		}while(choice!=6);
	}

}
