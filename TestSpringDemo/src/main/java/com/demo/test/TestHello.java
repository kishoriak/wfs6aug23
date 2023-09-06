package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.HelloWorld;
import com.demo.beans.MyUser;

public class TestHello {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
	System.out.println("Before getBean");
	HelloWorld hw=(HelloWorld) ctx.getBean("hw");
	System.out.println("after getBean");
	hw.sayHello();
	MyUser user1=(MyUser)ctx.getBean("u1");
	System.out.println(user1); 
	System.out.println(user1.getUname());
	//MyUser user2=(MyUser)ctx.getBean("u2");
	//System.out.println(user2.getUname());
}
}
