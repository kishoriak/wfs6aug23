package com.demo.beans;

import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class MyClass implements I1,I2{

	@Override
	public void m21() {
		System.out.println("In m21");
		
	}

	@Override
	public int m23() {
		System.out.println("In m23");
		return 0;
	}

	

	@Override
	public void m12() {
		System.out.println("In m12");
		
	}
	public void m14() {
		I1.super.m14();
		System.out.println("in ovverriden m14");
		
	}

	@Override
	public void m11() {
		// TODO Auto-generated method stub
		I1.super.m11();
		I2.super.m11();
		System.out.println();
		
	}

}
