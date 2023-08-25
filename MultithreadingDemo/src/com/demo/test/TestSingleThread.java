package com.demo.test;

import com.demo.beans.MyTable;

public class TestSingleThread {

	public static void main(String[] args) {
		MyTable ob=new MyTable();
		ob.printTable(5);
		ob.printTable(3);
		System.out.println(ob.factorial(5));

	}

}
