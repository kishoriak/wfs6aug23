package com.demo.beans;

public class MyTable {
    synchronized public void printTable(int n) {  //lock this object
    	for(int i=1;i<=10;i++)
		{
    		 
    		
			System.out.println(i+"*"+n+"="+(i*n));
		
			try {
			   Thread.sleep(300);
			   
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    	
	   }
    	
    }
    
    synchronized public int factorial(int n) {
    	int f=1;
    	for(int i=1;i<=n;i++) {
    		f=f*i;
    	}
    	return f;
    }
}
