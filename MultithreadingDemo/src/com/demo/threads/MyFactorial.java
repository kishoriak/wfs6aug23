package com.demo.threads;

import com.demo.beans.MyTable;

public class MyFactorial implements Runnable{
	private MyTable ob;
	private int num;
	public MyFactorial(MyTable ob, int num) {
		super();
		this.ob = ob;
		this.num = num;
	}
	public void run() {
		System.out.println(ob.factorial(num));
	}

}
