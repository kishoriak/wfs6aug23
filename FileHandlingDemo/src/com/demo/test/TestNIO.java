package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.demo.beans.Employee;
public class TestNIO {

	public static void main(String[] args) {
		//Path filePath = Paths.get("e:/", "temp","test.txt");
		Path filePath = Paths.get("test11.txt");
		try {
			Employee e=new Employee(1,"xxx",4567);
			Files.writeString(filePath,e.getEmpid()+","+e.getEname()+","+e.getSal());
			String s=Files.readString(filePath);
			System.out.println(s);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
