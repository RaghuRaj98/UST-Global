package com.deev.encapsulation;

public class TestEncap {
	public static void main(String[] args) {
		Encapsulation en = new Encapsulation();
		en.setId(123);
		
		en.setName("Raj");

		en.setEmail("raghu@gmail.com");

		en.setPassword("R@123");
		
		int id = en.getId();
		
		String name = en.getName();
		
		String email = en.getEmail();	
		
		System.out.println("ID = "+id);
		
		System.out.println("Name = "+name);
		
		System.out.println("Email = "+email);
		
		
		
		
	}
}
