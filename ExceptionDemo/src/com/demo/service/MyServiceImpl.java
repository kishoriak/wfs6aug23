package com.demo.service;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.demo.exceptions.AgeException;
import com.demo.exceptions.DataException;

public class MyServiceImpl implements MyService{

	public  void createObject() throws DataException  {
		Scanner sc=new Scanner(System.in);
		try {
			int age=sc.nextInt();
			if((age<18)||(age>60)){
				throw new AgeException("age cannot be < 18 and >60");
			}
		}catch(AgeException e) {
			System.out.println(e.getMessage());
			throw new DataException("something went wrong",
					                       new Throwable("Age is wrong"));
		}
		
	}

}
