package com.dev.asignment;

public class StringRev {
	public static void main(String[] args) {
		String str = "Raghu";
		System.out.println("The given String = "+str);
		char[] a = str.toCharArray();
		
		System.out.println("After reverse");
		for (int i=a.length-1;i>=0;i--){
			System.out.print(a[i]);
		}
		
	}
}
