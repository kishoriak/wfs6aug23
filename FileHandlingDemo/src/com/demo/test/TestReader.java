package com.demo.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {

	public static void main(String[] args) {
		try (BufferedReader br=new BufferedReader(new FileReader("test.txt"));){
			String s=br.readLine();
			while(s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
