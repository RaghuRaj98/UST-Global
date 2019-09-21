package com.dev.lambda;

public class Test2 {

	public static void main(String[] args) {
		FuncInt f = () ->{
			try{
				int i = 10 /0;
			}
			catch(Exception e){
				System.out.println("Exception");
			}
		};
		f.printVal();
		
		

	}

}
