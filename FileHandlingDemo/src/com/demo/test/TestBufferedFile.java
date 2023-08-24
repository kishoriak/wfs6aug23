package com.demo.test;

import java.io.IOException;

import com.demo.service.FileBufferedService;

public class TestBufferedFile {
 public static void main(String[] args) {
	try {
		FileBufferedService.copyFile("test.txt");
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
}
}
