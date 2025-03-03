package com.practiceexample;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setCar_id(101);
		c1.setName("BMW i4");
		c1.setColor("Black");
		c1.setModel("i4");
		c1.setCompany("BMW");
		c1.setPrice("75.50 Lakh");
		
	    System.out.println(c1);
	    
	    System.out.println(c1.getCar_id()+" " + c1.getName()+" "+ c1.getColor()+" "+
	    c1.getModel()+" "+ c1.getCompany()+ " "+ c1.getPrice());
		
	}

}
