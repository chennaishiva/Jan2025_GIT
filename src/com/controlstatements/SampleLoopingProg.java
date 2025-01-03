package com.controlstatements;

public class SampleLoopingProg {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		for (int i = 0; i <= 5; i++) {
			
			if(i==3) {
				System.exit(0);
			}
			
			System.out.println(i);
		}	
		
		System.out.println("End");
	}

}
