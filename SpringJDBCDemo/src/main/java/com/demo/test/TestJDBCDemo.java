package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestJDBCDemo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springcfg.xml");
		ProductService productService=(ProductService) ctx.getBean("productServiceImpl");
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1. Add Product\n2. Delete product\n3. modify product\n4.display All\n");
			System.out.println("5. display by id\n 6. display by price\n7. Exit\n");
			System.out.println("Choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				int n=productService.addProduct();
				if(n>0) {
					System.out.println("insertion done!!");
				}
				else {
					System.out.println("not found");
				}
				break;
			case 2:
				System.out.println("enetr id");
				int id=sc.nextInt();
				boolean status=productService.deleteById(id);
				if(status) {
					System.out.println("deleteion done !!");
				}
				else {
					System.out.println("not found");
				}
				break;
			case 3:
				System.out.println("enetr pid");
				id=sc.nextInt();
				System.out.println("enter qty");
				int qty=sc.nextInt();
				System.out.println("enter price");
				double pr=sc.nextDouble();
				 n=productService.updateById(id,qty,pr);
				 if(n>0) {
					 System.out.println("updation done");
				 }
				 else {
					 System.out.println("not found");
				 }
				break;
			case 4:
				List<Product> plist=productService.displayAll();
				if(plist!=null)
					plist.forEach(System.out::println);
				else
					System.out.println("not found");
				break;
			case 5:
				System.out.println("enter id");
				 id=sc.nextInt();
				try { 
				Product p=productService.getById(id);
				   if(p!=null) {
					System.out.println(p);
				   }
				}catch(EmptyResultDataAccessException e) {
				
					System.out.println("not found");
				}
				break;
			case 6:
				System.out.println("enetr low price");
				double lpr=sc.nextDouble();
				System.out.println("enetr high price");
				double hpr=sc.nextDouble();
				plist=productService.getByPrice(lpr,hpr);
				if(plist!=null)
					plist.forEach(System.out::println);
				else
					System.out.println("not found");
				break;
			case 7:
				
				System.out.println("Thank you for visiting");
				break;
			default:
				System.out.println("wrong choice");
				break;
			}
		}while(choice!=7);
		
	}

}
