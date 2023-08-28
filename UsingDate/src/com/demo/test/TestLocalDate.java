package com.demo.test;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestLocalDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr date(dd/mm/yyyy)");
		String dt=sc.next();  //22/11/1980
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dt1=null;
		try {
			 dt1=sdf.parse(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dt1);
		System.out.println(sdf.format(dt1));

	}

}
