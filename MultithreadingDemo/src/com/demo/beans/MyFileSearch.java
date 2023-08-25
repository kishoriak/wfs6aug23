package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileSearch {
	
	public boolean searchString(String fname,String searchString) {
		try(BufferedReader br=new BufferedReader(
				                          new FileReader(fname))){
			String str=br.readLine();
			while(str!=null) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(str.equals(searchString)) {
					return true;
				}
				str=br.readLine();
			}
		
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
