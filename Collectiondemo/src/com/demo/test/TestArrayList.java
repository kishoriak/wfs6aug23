package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestArrayList {

	public static void main(String[] args) {
		List<Integer> v=new ArrayList<>(); //dimond operator
		v.add(10);
		v.add(20);
		v.add(10);
		//v.add("Hello");
		//v.add(new Employee(12,"xxx",3456));
		System.out.println(v);
		
		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		
		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		
		
		System.out.println("Size : "+v.size());
		
		
	}

}
