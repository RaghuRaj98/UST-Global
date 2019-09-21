package com.dev.inheritance;

public class GrandFather {
	
	protected String lastName="Sam";
	String name = "Snjay";
	static int age = 80;
	
	
	public static void main(String[] args) {
		GrandFather g = new GrandFather();
		
		g.printName();

	}
	
	protected void printName() {
		
		System.out.println(name+" "+lastName);
	}
	
	
}
