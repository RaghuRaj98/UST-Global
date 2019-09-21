package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str="Some String";
		int length= str.length();
		String str1="SomeSString";
		System.out.println("output for length() = "+length);
		
		char[] ch = str.toCharArray();
		
		System.out.println("output for toCharArray"+ch[9]);
		
		char c = str.charAt(4);
		
		System.out.println("OP of charAt"+c);
		
		boolean b = str.equals(str1);
				
		
		System.out.println("output of equals = "+b);
		
		boolean c1= str.equalsIgnoreCase(str1);
		
		System.out.println("output of equalsIgnreCase = "+c1);
		
		String g = str.substring(3);
		
		System.out.println(g);
		
		String h = str.substring(2,4);
		
		System.out.println(h);
		
		System.out.println();
		
	}

}
