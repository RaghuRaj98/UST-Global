package com.dev.exception;

public class CustomException extends Exception {

	public CustomException() {
		System.out.println("no para");
	}
	
	public CustomException(int a) {
		System.out.println("int para");
	}
}
