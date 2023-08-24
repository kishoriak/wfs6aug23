package com.demo.test;

import com.demo.service.FileDataService;

public class TestDataInputStream {
	public static void main(String[] args) {
		FileDataService.writedata("testdata.txt");
		FileDataService.readdata("testdata.txt");
		FileDataService.readLineByLine("test.txt");
		
	}

}
