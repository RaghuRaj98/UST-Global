package com.dev.array;

public class ArrayExample {

	public static void main(String[] args) {
		int []intarray;//declaration
		char[] chararray;
		byte bytearray[];
		intarray = new  int[5];// creation
		chararray = new char[5];
		bytearray = new byte[5];
		
		int[] a = new int [10]; //declaration and create
		
		int[] b = {10,20,30,40,50};
		int index = 3;
		if (index>=0 && index<b.length){
			System.out.println("Index  is  Valid");
			for (int i=0;i<=index;i++){
				System.out.println(b[i]);
			}
		}
		else{
			System.out.println("Index not present");
		}
		
		System.out.println("Length of b array is "+b.length);
		
		intarray[0]=1;//initialization
		intarray[1]=2;
		intarray[2]=3;
		intarray[3]=4;
		intarray[4]=5;
		
		chararray[0]='a';
		chararray[1]='b';
		chararray[2]='c';
		chararray[3]='d';
		chararray[4]='e';
		
		bytearray[0]=1;
		bytearray[1]=2;
		bytearray[2]=3;
		bytearray[3]=4;
		bytearray[4]=5;
		
		int res= intarray[1]*3;
		System.out.println(res);
		
		res= intarray[2]+3;
		System.out.println(res);
		
		res= intarray[3]-3;
		System.out.println(res);
		
		res= intarray[4]%3;
		System.out.println(res);
		
		
	}
 
}
