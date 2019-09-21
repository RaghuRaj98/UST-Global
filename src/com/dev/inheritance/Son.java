package com.dev.inheritance;

public class Son extends Father {

	String name = "Superman";
	static int a = 10;

	@Override
	public void printName() {
		System.out.println(name + " " + super.name + " " + lastName);
		System.out.println(a);
	}

	/*
	 * public static void printName(int a){ int a1=a; System.out.println(a1); }
	 */

	public static void main(String[] args) {
		Son s = new Son();
		s.printName();
		int[] a= {10,20,30,40};
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println(age);

	}

}
