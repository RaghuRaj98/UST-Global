package com.dev.methodoverloading;

public class MathBasics {

	void basic()
	{
		System.out.println("Basic math operation");
	
	}
	
	void add(int a,int b){
		System.out.println("Sum of "+a+" and "+b+" is "+ (a+b));
	}
	
	void add(int a,int b, int c){
		System.out.println("Sum of of "+a+" and "+b+"and"+c+ "= "+ (a+b+c));
	}
	
	void add(int a,int b, int c,int d){
		System.out.println("Sum of of "+a+" and "+b+"and"+c+ "and "+d+"= "+ (a+b+c+d));
	}
	
	void sub(int a,int b){
		System.out.println("Sub of "+a+" and "+b+" is "+ (a-b));
	}
	
	void sub(int a,int b, int c){
		System.out.println("Sub of of "+a+" and "+b+"and"+c+ "= "+ (a-b-c));
	}
	
	void sub(int a,int b, int c,int d){
		System.out.println("Sub of of "+a+" and "+b+"and"+c+ "and "+d+"= "+ (a-b-c-d));
	}
	
	void mul(int a,int b){
		System.out.println("mul of of "+a+" and "+b+" is "+(a*b));
	}
	
	static void  mul(int a,int b,int c){
		System.out.println("Multiplication of "+a+" and "+b+"and"+c+ "= "+(a*b*c));
	}
	
	private void mul(int a,int b,int c,int d){
		System.out.println("Mul of of "+a+" and "+b+"and"+c+ "and "+d+"= "+ (a*b*c*d));
	}
	
	final void  div(int a, int b){
		System.out.println("Division of "+a+" and "+b+" is "+(a/b));
	}
	
	
	void div(int a, int b,int c){
		System.out.println("Division of of "+a+" and "+b+"and"+c+ "= "+((a/b)/c));
	}
	
	void div(int a, int b,int c,int d){
		System.out.println("Division of of "+a+" and "+b+"and"+c+ "and "+d+"= "+((a*b)/(c*d)));
	}
	
	
	
	public static void main(String[] args) {
		MathBasics m = new MathBasics();
		
		m.basic();
		m.add(10,20);
		m.add(10, 20, 30);
		m.add(10, 20, 30, 40);
		m.sub(10,20);
		m.sub(10, 20, 30);
		m.sub(10, 20, 30, 40);
		m.mul(10,20);
		mul(10, 20, 30);
		m.mul(10, 20, 30, 40);
		m.div(20, 10);
		m.div(90, 80, 50);
		m.div(100, 20, 2, 4);
		
		for(;;){
			System.out.println("Hi");
		}
		
	
	}
}
