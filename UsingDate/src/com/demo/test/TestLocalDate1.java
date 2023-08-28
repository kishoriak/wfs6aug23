package com.demo.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestLocalDate1 {

	public static void main(String[] args) {
		LocalDate ldt=LocalDate.now();
		LocalDate ldt1=LocalDate.parse("22/11/2001", 
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(ldt1);

	}

}
