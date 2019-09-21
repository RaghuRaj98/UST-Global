package com.dev.lambda;

public class Test {

	public static void main(String[] args) {
		FuncInt f = () ->{
			for (int i =1; i<=10;i++){
				System.out.println("i = "+i);
			}
			
		};
		f.printVal();
		
		FunctionalInt2 f2 = (int i) -> {
			for(int j=1;j<=i; j++){
				System.out.println(j);
			}
		};
		f2.printval(10);
	}
}

