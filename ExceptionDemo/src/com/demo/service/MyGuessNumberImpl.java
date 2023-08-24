package com.demo.service;

import java.util.Scanner;

import com.demo.exceptions.BlockAccountException;
import com.demo.exceptions.NumberNotCorrectException;

public class MyGuessNumberImpl implements MyGuessNumber {
    private static int num;
    static {
    	num=56;
    }
    
    public boolean checkNumber() throws BlockAccountException {
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<3;i++) {
	    	try {
		    	System.out.println("enter number");
		    	int num1=sc.nextInt();
		    	if (num==num1) {
		    		
		    		return true;
		    	}
		    	throw new NumberNotCorrectException
		    	    ("Oops, you loose one attempt, pls try again ");
	    	}catch(NumberNotCorrectException e) {
	    		System.out.println(e.getMessage());
	    		if(i==2) {
	    			throw new BlockAccountException
("You finished all attempts, pls buy another card to play again");
	    		}
	    		
	    			
	    		
	    	}
	    	
	    	
    	}//end for
		return false;
    	
    	
    }
}
