package com.practiceexample;

public class HospitalMain {
	
	public static void main(String[] args) {
		
		Hospital h1 = new Hospital();
		h1.setHospital_id(101);
		h1.setName("Sanchiti");
		h1.setCity("Pune");
		h1.setState("Maharashtra");
		h1.setDoctors(20);
		h1.setPateint(100);
		h1.setDepartments("Neurology");
		h1.setEmail("sanchiti@gmail.com");
		h1.setPhone_no("8888368888");
		
		System.out.println(h1);
		
		System.out.println(h1.getHospital_id()+" " + h1.getName()+" "+ h1.getCity()+ " "+ h1.getState()+" "+
		                   h1.getDoctors()+" "+ h1.getPateint()+" "+ h1.getPateint()+" "+ h1.getEmail()+" "+h1.getPhone_no());
	}
	
	
	

}
