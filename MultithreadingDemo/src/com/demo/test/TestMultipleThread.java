package com.demo.test;

import com.demo.beans.MyTable;
import com.demo.threads.MyFactorial;
import com.demo.threads.MyPrintTableThread;

public class TestMultipleThread {

	public static void main(String[] args) {
		MyTable ob=new MyTable();
		MyTable ob1=new MyTable();
		MyTable ob2=new MyTable();
		MyPrintTableThread t1=new MyPrintTableThread(ob,5);
		t1.setPriority(Thread.MIN_PRIORITY);
		MyPrintTableThread t2=new MyPrintTableThread(ob1,3);
		t2.setPriority(Thread.MAX_PRIORITY);
		MyFactorial t3=new MyFactorial(ob2,5);
		Thread th3=new Thread(t3);
		t1.start();
		t2.start();
		th3.start();
		System.out.println("main thread resumes execution");
		try {
			t1.join();
			t2.join();
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("main ends here");
		

	}

}
