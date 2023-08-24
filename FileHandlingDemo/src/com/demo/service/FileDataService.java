package com.demo.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDataService {

	public static void writedata(String fname) {
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(fname));){
			dos.writeInt(10);
			dos.writeUTF("Kishori");
			dos.writeDouble(123.45);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void readdata(String fname) {
		try(DataInputStream dis=new DataInputStream(new FileInputStream(fname));){
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readDouble());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void readLineByLine(String fname) {
		try(DataInputStream dis=new DataInputStream(new FileInputStream(fname));){
			String s=dis.readLine();
			while(s!=null) {
				System.out.println(s);
				s=dis.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
