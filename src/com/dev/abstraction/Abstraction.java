package com.dev.abstraction;

public class Abstraction extends  AbstractExample{

	public Abstraction() {
		System.out.println("cost of abstraction class");
	}
	@Override
	void display()
	{
		System.out.println("Hi abstrsct implemrnted in chils class");	
	}
	public static void main(String[] args) {
		Abstraction abs = new Abstraction();
		abs.display();
	}
	
	

}
