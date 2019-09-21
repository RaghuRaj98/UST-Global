package com.dev.abstraction;

public class Tiger extends Goat{

	

	@Override
	public void hunt() {
		System.out.println("tiger will hunt and eat");
		
	}

	public static void main(String[] args) {
		Tiger t= new Tiger();
		t.hunt();
	}
		
	
}
