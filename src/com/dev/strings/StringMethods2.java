package com.dev.strings;

public class StringMethods2 {

	public static void main(String[] args) {
		String str="Compuer";
		int length= str.length();
		System.out.println(str.contains("a"));;
		String str1="computer";
		System.out.println("output for length() = "+length);
		
		char[] ch = str.toCharArray();
			
		System.out.println("output for toCharArray"+ch[5]);
		
		char c = str.charAt(4);
		
		System.out.println("OP of charAt="+c);
		
		boolean b = str.equals(str1);
				
		
		System.out.println("output of equals = "+b);
																
		boolean c1= str.equalsIgnoreCase(str1);
		
		System.out.println("output of equalsIgnreCase = "+c1);
		
		boolean v = str1.contains("rag");
		
		System.out.println("output of contains ()"+v);
		
		String n=str.replace("Co", "GO");
		
		System.out.println(n);
		
		int ind = str.indexOf("C");
		
		System.out.println(ind);
		
		String s= str.toUpperCase();
		System.out.println(s);
		
		
		String l= s.toLowerCase();
		System.out.println(l);
		

	}

}
