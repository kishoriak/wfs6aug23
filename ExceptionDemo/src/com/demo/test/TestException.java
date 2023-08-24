package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		String str=null;
		
		int i;
		try(Scanner sc=new Scanner(System.in);) {
			//open file
			//reading file
			
			System.out.println("enetr number");
			i=sc.nextInt();
			int a=5;
			int b=0;
			int c=divide(a,b);
			
			System.out.println(str.length());
			//closing file
			
		}catch(NullPointerException|InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Obejct is null");
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" in main method");
			System.out.println("Cannot divide a number by zero");
		}catch(Exception e) {
			System.out.println("error occured"+"  "+e.getMessage());
		}finally {
			//cleanup activity
			System.out.println("this is finally block");
			//sc.close();
		}
	}

	private static int divide(int a, int b) {
		try {
		   return a/b;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()+"," +"in divide function");
			System.out.println("Cannot divide a number by zero");
			throw e;    //rethrowing the exception
		}
		//return 0;
	}

}
