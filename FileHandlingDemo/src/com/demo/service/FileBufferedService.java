package com.demo.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBufferedService {

	public static void copyFile(String fname) throws FileNotFoundException,IOException {
		
		//to check file exists or not
		File f=new File("testcopy.txt");
		BufferedOutputStream bos=null;
		if(f.exists()) {
			//open in append mode
			 bos=new BufferedOutputStream(new FileOutputStream("testcopy.txt",true));
		}else {
			//open it in write mode
			 bos=new BufferedOutputStream(new FileOutputStream("testcopy.txt"));
		}
		
		//to open the file for reading and writing and create a copy
		try (BufferedInputStream bis=new  BufferedInputStream(new FileInputStream(fname));
				BufferedOutputStream fos1=bos;
			){
			int i=bis.read();
			while(i!=-1) {
				fos1.write(i);
				i=bis.read();
			}
			 
			
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e1) {
			throw e1;
		}
	}

}
