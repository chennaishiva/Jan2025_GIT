package org.tcs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Client  {
	
	public static void main(String[] args) {
		
		Login a = new Login();
		a.setUserId(12345);
		a.setPassword("qwerty");
		
		Login b = new Login();
		b.setUserId(33445);
		b.setPassword("asdfg");
		
		Login c = new Login();
		c.setUserId(7655);
		c.setPassword("zxcvb");
		
		
		//UserDefined list
		
		List<Login> li = new ArrayList();
		li.add(a);
		li.add(b);
		li.add(c);
		
		for (int i = 0; i < li.size(); i++) {
			
			Login l = li.get(i);
			
			System.out.println(l.getUserId());
			System.out.println(l.getPassword());
		}
		
		//UserDefined set
		
		Set<Login> s = new LinkedHashSet();
		s.add(a);
		s.add(b);
		s.add(c);
		
		for (Login x : s) {
			System.out.println(x.getUserId());
			System.out.println(x.getPassword());
			
		}
		
		
		
	}
	
}
