package com.dev.inheritance;

public class Daughter extends Father{
   
	String name = "Emma";
	
	@Override
	
	public void  printName()
	{
		System.out.println(name+" "+super.name+" "+lastName);
	}
	public static void main(String[] args) {
		Daughter d= new Daughter();
		d.printName();

	}

}
