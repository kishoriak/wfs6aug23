package com.demo.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileService {

	public static void copyFile(String fname) throws FileNotFoundException,IOException {
		
		//to check file exists or not
		File f=new File("testcopy.txt");
		//fos is effectively final
		FileOutputStream fos=null;
		if(f.exists()) {
			//open in append mode
			 fos=new FileOutputStream("testcopy.txt",true);
		}else {
			//open it in write mode
			 fos=new FileOutputStream("testcopy.txt");
		}
		
		//to open the file for reading and writing and create a copy
		try (FileInputStream fis=new FileInputStream(fname);
				FileOutputStream fos1=fos;
			){
			int i=fis.read();
			while(i!=-1) {
				fos1.write(i);
				i=fis.read();
			}
			 
			
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e1) {
			throw e1;
		}
	}

}
