package com.dev.asignment;

public class Sum {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		
		int sum = arr[0]+arr[arr.length/2]+arr[arr.length-2];
		
		System.out.println("Sum of "+arr[0]+" + "+arr[arr.length/2]+" + "+arr[arr.length-2]+" = "+sum);
	}
}
