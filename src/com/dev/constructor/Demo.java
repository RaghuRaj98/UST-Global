package com.dev.constructor;

import com.dev.inheritance.GrandFather;




public class Demo extends GrandFather{
	
	public void protectedxample(){
		
		System.out.println(lastName);
		//System.out.println(name);// we cann't do this because it is default
	}
	

}


