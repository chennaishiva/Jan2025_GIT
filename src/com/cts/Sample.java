package com.cts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {
		
		//Create an object for set interface
		
		Set s = new TreeSet();
		
		s.add(10);
		s.add(2);
		s.add(23);
		s.add(12);
		s.add(45);
	
		//To print all the values in set
		System.out.println(s);
	
		//To find the size of the set
		int size = s.size();
		System.out.println(size);
		
		//To check that the given value is present or not
		System.out.println(s.contains(23));
		
		//To remove a value in set
		s.remove(23);
		System.out.println(s);
		
		//To add all the value from one set to another set
		Set<Integer> s1 = new LinkedHashSet();
		s1.addAll(s);
		System.out.println(s1);
		
		//To iterate all the values in set using enhanced for loop
		for (Integer x : s1) {
			System.out.println(x);
		}
		
		
		
		
		
	}
	
}
