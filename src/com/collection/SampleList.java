package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class SampleList {
	
	public static void main(String[] args) {
		
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(2);
		li.add(1);
		li.add(23);
		li.add(33);
		li.add(10);
		
		/*Generics
		 *jdk 1.5
		 - passing of wrapper class inside<wrapper class>
		
		wrapper class --> class of dataType is wrapper class*/
		
		System.out.println(li);
		
		Integer i = li.get(2);
		
		for (Integer x : li) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
