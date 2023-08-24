package com.demo.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.demo.service.FileService;

public class TestFile1 {

	public static void main(String[] args) {
		try {
			FileService.copyFile("test.txt");
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("error in reading or writing the file");
		}

	}

}
