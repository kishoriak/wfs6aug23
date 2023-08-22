package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.Compare;
import com.demo.interfaces.CompareString;
import com.demo.interfaces.I1;
import com.demo.interfaces.I2;
import com.demo.interfaces.MyCompare;

public class TestMyClass {

	public static void main(String[] args) {
		System.out.println(I2.i);
		//I2.i=34;  //error
        I2 ob=new MyClass();
		ob.m11();
		((MyClass)ob).m21();
		
		//functional interface
		Compare c=(x,y)->{return x>y?x:y;};
        System.out.println(c.findMax(30,20));
        
        //functional interface
        CompareString c1=(s,s1)->s.compareTo(s1)>0?s:s1;
        
        //Generic Functional interface
        MyCompare<Integer> ob1=(x,y)->{return x>y?x:y;};
        MyCompare<String> ob2=(s,s1)->s.compareTo(s1)>0?s:s1;
        System.out.println(ob1.findMax(23,45));
        System.out.println(ob2.findMax("Hello","Welcome"));
	}

}
