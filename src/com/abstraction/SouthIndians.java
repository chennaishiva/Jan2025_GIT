package com.abstraction;

public class SouthIndians extends Indians{

	@Override
	public void breakfast() {
		System.out.println("Idly or dosa");
	}

	public static void main(String[] args) {
		SouthIndians s = new SouthIndians();
		s.aadharCard();
		s.panCard();
		s.breakfast();
		
		Indians i = new SouthIndians();
		i.breakfast();
		i.aadharCard();
		i.panCard();
	}
}
