package com.dev.exception;

public class ExceptionExample {
	public static void main(String[] args) throws Exception {

	System.out.println("printing before ");
	
	try{
		s();
		System.out.println("No exception for s()");
		d();
		System.out.println("NO exception for divide()");
	}catch (NegativeArraySizeException e){
		System.out.println(" Negetive array Exception occured");
		System.err.println("Exception caugght in catch");
		//e.printStackTrace();
		
	}catch (ArithmeticException e) {
		System.out.println("Array index out of bound");
	}
	finally{
		System.out.println("this is finally block");
	}
	
	}
	
	public static void s()
	{
		StringBuffer sb = new StringBuffer(-1);
	}
	
	public static void d() throws Exception{
		int a=1;
		int b=0;
		int c=a/b;	
	}
}
