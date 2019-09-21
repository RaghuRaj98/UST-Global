package com.dev.threads;

public class PrinterWithoutSynchronized {

	public  void printVal(int i,String t){
		for(int i1 =1 ;i1 <=10;i1 ++ ){
			System.out.println("Thread = "+t+"   "+i1 );
		}
	}
}
