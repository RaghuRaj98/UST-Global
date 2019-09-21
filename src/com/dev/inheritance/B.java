package com.dev.inheritance;

public class B extends A{

	String b = "Hi i am class B";
	
	B(){
		super();
	}
	@Override
	public void showdata(){
		System.out.println(b);
	}
	
	
	/*void p()
	{
		final method cann't be overridden
	}*/
	/*@Override
	void m(){
		private method cann't be overridden
	}*/
	
	/*void n(){
		static method cannot be over ridden
	}
	*/
}
