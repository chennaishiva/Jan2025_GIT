package com.stringProg;

public class SampleStringProg {
	
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "sql";
		
		String concat = s1.concat(s2);
		System.out.println(concat);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(concat));
		
		System.out.println("********");
		
		StringBuffer s3 = new StringBuffer("Java");
		StringBuffer s4 = new StringBuffer("Python");
		
		StringBuffer append = s3.append(s4);
		System.out.println(append);
		
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(append));
	
	}
	
}
