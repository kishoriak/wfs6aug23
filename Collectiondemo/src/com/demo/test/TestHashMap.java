package com.demo.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.demo.beans.Employee;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String,Integer> hmap=new HashMap<>();
		//add data in the map
		hmap.put("Python", 300);
		hmap.put("Java", 400);
		hmap.put("Perl", 500);
		//to check whether key exists or not
		if(hmap.containsKey("Python")) {
			System.out.println("key exists");
		}
		else {
		   hmap.put("Python", 800);
		}
		System.out.println(hmap.get("Python"));
		Set<String> kset=hmap.keySet();
		for(String s:kset) {
			System.out.println(s+"--->"+hmap.get(s));
		}
		
		Iterator<String> it=kset.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s+"--->"+hmap.get(s));
		}
		
		kset.forEach(s->System.out.println(s+"--->"+hmap.get(s)));
		
		Set<Map.Entry<String, Integer>> hs=hmap.entrySet();
		for(Map.Entry<String, Integer> entry:hs) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		
		//to display all books with pages > 500
		for(String s:kset) {
			if(hmap.get(s)>500)
			   System.out.println(s+"--->"+hmap.get(s));
		}

	}

}
