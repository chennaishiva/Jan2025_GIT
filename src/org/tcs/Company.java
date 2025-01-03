package org.tcs;

public class Company {
	
	public static void main(String[] args) {
		
		int a[] = new int[10];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[2] = 100;
		
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		int length = a.length;
		System.out.println(length);
		
		//Iterate array using normal for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//Iterate array using enhanced for loop
		for(int x : a) {
			System.out.println(x);
		}
		
		
	}
}
