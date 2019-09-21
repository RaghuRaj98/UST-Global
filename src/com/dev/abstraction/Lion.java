package com.dev.abstraction;

public class Lion extends Animal{

	@Override
	public void eat() {
		System.out.println("Lion eat");
		
	}

	@Override
	public void hunt() {
		System.out.println("Lion Hunt");
		
	}
	
	public static void main(String[] args) {
		Lion l = new Lion();
		
		l.hunt();
		
		l.eat();
	}

}
