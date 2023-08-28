package com.demo.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class TestHashSet {
   public static void main(String[] args) {
	    Set<Integer> hs=new TreeSet<>();
	    hs.add(12);
	    hs.add(10);
	    hs.add(300);
	    hs.add(234);
	    if(!hs.add(10)) {
	    	System.out.println("duplicate number");
	    }
	    System.out.println(hs);
	    
	    Set<Employee> es1=new HashSet<>();
	    es1.add(new Employee(10,"xxxx",5678));
	    es1.add(new Employee(10,"yyy",567811));
	    System.out.println(es1);
	    
	    
	    
	    
	
   }
}
