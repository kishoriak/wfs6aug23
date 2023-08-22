package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;

public class TestAccountMgmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		AccountService aservice=new AccountServiceImpl();
		do {
			System.out.println("1. Add new account\n 2. withdraw \n 3. deposite\n 4. check balance\n");
			System.out.println("5. display all\n 6. display by id\n 7.display by mobile\n8. exit\n choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1. Saving account \n2.current account\n 3. demat\n");
				int ch=sc.nextInt();
				aservice.addnewAccount(ch);
				break;
			case 5:
				Account[] accarr=aservice.getAll();
				for(Account ac:accarr) {
					if(ac==null)
						break;
					System.out.println(ac);
				}
				break;
			case 8:
				System.out.println("Thank you for visiting ...");
				sc.close();
				break;
			default:
				System.out.println("wrong choice");
			}
			
		}while(choice!=8);

	}

}
