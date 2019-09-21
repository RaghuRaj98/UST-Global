package com.dev.constructor;

public class AddChild extends Addition{
	
	public AddChild() {
		super();
		
	}
	
	public AddChild(int a,int b){
		super(a, b);
		
	}
	public static void main(String[] args) {
		AddChild a = new AddChild();
		
		AddChild b = new  AddChild(20, 30);
	}
}
