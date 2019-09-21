package com.dev.polymorphism;

public class Child extends Parent{

	int childmoney = 20000;
	
	void printmoney(){
		System.out.println(money+childmoney);
	}
	
	
	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.printmoney();
	}
}
