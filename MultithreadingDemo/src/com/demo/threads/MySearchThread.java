package com.demo.threads;

import com.demo.beans.MyFileSearch;

public class MySearchThread extends Thread {
	private MyFileSearch fs;
	private String search;
	
	public MySearchThread(MyFileSearch fs,String search) {
		super();
		this.fs = fs;
		this.search=search;
		
	}

	public void run() {
		boolean status=fs.searchString("mywords.txt", search);
		if(status) {
			System.out.println("String found ..."+search);
		}
		else {
			System.out.println("String not found ..."+search);
		}
	}

}
