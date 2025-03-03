package com.practiceexample;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();  // creating the object
		e1.setE_id(101);
		e1.setFrist_name("Samir");
		e1.setLast_name("Kale");
		e1.setCity("Pune");
		e1.setPhone_no("8888988748");
		e1.setRole("PHP Developer");
		e1.setSalary("3.5LPA");
		e1.setExprience(2);
		
		System.out.println(e1.getE_id()+" "+e1.getFrist_name()+" "+ e1.getLast_name()+" "+ 
		e1.getCity()+" "+ e1.getPhone_no()+" "+ e1.role+" "+e1.getSalary()+" "+ e1.getExprience());
		
		System.out.println(e1);
	}
		
}
