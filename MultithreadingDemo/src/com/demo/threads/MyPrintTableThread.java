package com.demo.threads;

import com.demo.beans.MyTable;

public class MyPrintTableThread extends Thread {
	private MyTable ob1;
	private int num;
	public MyPrintTableThread(MyTable ob1, int num) {
		super();
		this.ob1 = ob1;
		this.num = num;
	}
	public void run() {
		ob1.printTable(num);
	}
	
	

}
