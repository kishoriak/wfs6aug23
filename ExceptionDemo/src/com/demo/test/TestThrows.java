package com.demo.test;

import java.io.FileNotFoundException;

import com.demo.exceptions.AgeException;
import com.demo.exceptions.DataException;
import com.demo.service.MyService;
import com.demo.service.MyServiceImpl;

public class TestThrows {
	public static void main(String[] args) {
		MyService ob=new MyServiceImpl();
			try {
				ob.createObject();
			}  catch (DataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	

}
