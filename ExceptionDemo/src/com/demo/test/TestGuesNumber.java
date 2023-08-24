package com.demo.test;

import com.demo.exceptions.BlockAccountException;
import com.demo.service.MyGuessNumber;
import com.demo.service.MyGuessNumberImpl;

public class TestGuesNumber {

	public static void main(String[] args) {
		MyGuessNumber obj=new MyGuessNumberImpl();
		try {
			boolean status=obj.checkNumber();
			if(status) {
				System.out.println("Yepee!!!, your guess is right");
			}
		} catch (BlockAccountException e) {
			System.out.print ("Your account is block,);");
			System.out.println(" pls contact adminitration");
		}

	}

}
