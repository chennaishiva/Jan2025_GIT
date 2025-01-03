package com.polymorphsim;

public class EmployeeDetails {
	
	//Arguments depends on dataType
	private void empInfo(int age) {
		System.out.println(age);
	}
	
	//Arguments depends on order
	private void empInfo(String name, char gender) {
		System.out.println(name);
		System.out.println(gender);
	}
	
	//Arguments depends on dataType count or number
	private void empInfo(String name, String email, char gender) {
		System.out.println("Employee info :" + name +'\n'+ email +'\t'+ gender);
	}
	
	// --> '\t' --> tab space
	// --> '\n' --> next line or new line
	
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.empInfo(34);
		e.empInfo("ram", 'm');
		e.empInfo("ram", "ram@gmail.com", 'm');
		
		e.empInfo(40);
		e.empInfo("reena", 'f');
		e.empInfo("reena", "reena@gmail.com", 'f');
	}

}
