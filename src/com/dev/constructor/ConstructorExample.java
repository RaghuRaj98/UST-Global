package com.dev.constructor;

public class ConstructorExample {

	
	public ConstructorExample(){
		
		System.out.println("This is no argument constructor");
		
	}
	
	public ConstructorExample(int a){
		
		System.out.println("This is a parameterized constructor accepting integer");
		
		
	}
	
	public  ConstructorExample(String s) {
		System.out.println("This is a parameterized constructor accepting String");
	}
	
	public  ConstructorExample(String s,int a) {
		System.out.println("This is a parameterized constructor accepting String and ineger");
	}
	
	public  ConstructorExample(int a,String s) {
		System.out.println("This is a parameterized constructor accepting String and ineger");
	}
	
	public  ConstructorExample(int a,String s,double d) {
		System.out.println("This is a parameterized constructor accepting String and ineger and double");
	}
	public  ConstructorExample(int a,double d,String s) {
		System.out.println("This is a parameterized constructor accepting String and ineger and double");
	}
	public  ConstructorExample(double d,String s,int a) {
		System.out.println("This is a parameterized constructor accepting String and ineger and double");
	}
	
	
	public static void main(String[] args) {
		ConstructorExample a=new ConstructorExample();
		
		ConstructorExample b=new ConstructorExample(10);
		
		ConstructorExample c=new ConstructorExample("Raghu");
		
		ConstructorExample d=new ConstructorExample("Raghu",10);
		
		ConstructorExample e=new ConstructorExample(10,"Raghu");
		
		ConstructorExample f=new ConstructorExample(10,"Raghu",9.0);
		
		ConstructorExample g=new ConstructorExample(10.0,"Raghu",9);
		
		
	}
}
