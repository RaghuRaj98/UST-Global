package com.dev.methods;

public class MethodExample2 {
	
	public static void main(String[] args) {
		System.out.println("Area of Square = "+MethodExample.calArea(5));
		
		MethodExample m = new MethodExample();
		
		System.out.println("Calling non static method in different class to calculate area of rectangle(10*30) = "+m.areaRec(10, 30));
		
	}
}
