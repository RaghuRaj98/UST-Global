package com.dev.methods;

public class MethodExample 
{
	
	public static int i=10; //global variable 
	static char c='j';
	int area;

	public MethodExample()
	{
		System.out.println("Hi i am constructor'");
	}
	
	public static void main(String[] args) 
	{
		MethodExample me=  new MethodExample();
		int area =calArea(6); //local variable
		
		System.out.println("Area of Square = "+area);
		
		int area1= me.areaRec(10, 20);
		
		System.out.println(area1);

	}
    
	
	public static int calArea(int side){
		int area =side*side;
		return area;
		
	}
	public int areaRec(int len,int width){
		int area = len*width;
		return area;
	}
}
