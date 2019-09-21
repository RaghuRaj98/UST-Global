package com.dev.exception;

public class ExceptionExamples {
	
	void nulltoString()throws Exception{
		
		String s= null;
		System.out.println(s.length());
	}
	
	void thread() throws InterruptedException 
	{
		Thread.sleep(10000);
	}
	
	public static void main(String[] args) throws Exception {
		
		ExceptionExamples ex = new ExceptionExamples();
		
		ex.thread();
		try{
		ex.nulltoString();
		}
		finally{
			System.out.println("not handled");
		}
		try {
			int a = 10/0;
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Divide by zero exception");
		}
		catch (Exception e)
		{
			System.out.println("second catch");
		}
		finally{
			String a= null;
			System.out.println("finally");
		}
		
	}
}
