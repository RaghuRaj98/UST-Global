package com.dev.exception;

public class ExceptionHandling extends CustomException{

	public static void main(String[] args) throws CustomException {
		
	
	try{
		divide(10,0);
		
	}catch(Exception e){
		throw new CustomException(10);
		
	}
	
}
	public static int divide(int i,int j){
		int res = i/j;
		System.out.println(res);
		return 1;
		
	}
}
