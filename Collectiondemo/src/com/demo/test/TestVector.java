package com.demo.test;

import java.util.Vector;

import com.demo.beans.Employee;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(20); //dimond operator
		v.add(10);
		v.add(20);
		v.add(10);
		//v.add("Hello");
		//v.add(new Employee(12,"xxx",3456));
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		v.ensureCapacity(30);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		
		

	}

}
