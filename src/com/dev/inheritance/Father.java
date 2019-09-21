package com.dev.inheritance;

public class Father extends GrandFather{

	String name = "Eddward";
	
	@Override
	public void printName(){
		
		System.out.println(name+" "+super.name+" "+lastName);
	}
	public static void main(String[] args) {
		Father f = new Father();
		f.printName();
		
	}
}
