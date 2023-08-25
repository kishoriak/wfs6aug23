package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyFileSearch;
import com.demo.threads.MySearchThread;

public class TestSearchString {
public static void main(String[] args) {
	MySearchThread[] tharr=new MySearchThread[5];
	MyFileSearch fs=new MyFileSearch();
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++) {
		System.out.println("enter string to search");
		String s=sc.next();
		tharr[i]=new MySearchThread(fs,s);
		tharr[i].start();
	}
	for(int i=0;i<5;i++) {
		try {
			tharr[i].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
