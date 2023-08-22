package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;
import com.demo.beans.User;
import com.demo.doa.AccountDao;
import com.demo.doa.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	private AccountDao adao;
	

	public AccountServiceImpl() {
		adao=new AccountDaoImpl();
	}


	@Override
	public void addnewAccount(int ch) {
		Scanner sc=new Scanner(System.in);
		User[] user=new User[2];
		System.out.println("1. Individual \n 2. Joint");
		int type=sc.nextInt();
		for(int i=0;i<user.length;i++) {
			System.out.println("enter firstname");
			String fname=sc.next();
			System.out.println("enter lastname");
			String lname=sc.next();
			System.out.println("enter mobile");
			String mob=sc.next();
			System.out.println("enter email");
			String em=sc.next();
			user[i]=new User(fname,lname,mob,em);
			if(type==1)
				break;
		}
		System.out.println("enter balance");
		double balance=sc.nextDouble();
		Account acc=null;
		if(ch==1) {
			System.out.println("Enter cheque book number");
			String chequebk=sc.next();
			acc=new SavingAccount(user, balance, chequebk);
		}
		else {
			if(ch==2) {
				System.out.println("Enter min number of transactions");
				int tranNum=sc.nextInt();
				acc=new CurrentAccount(user, balance, tranNum);
			}
			else {
				//Demat Account
			}
		}
		adao.save(acc);
	}


	@Override
	public Account[] getAll() {
		return adao.findall();
	}
	

	
	

}
