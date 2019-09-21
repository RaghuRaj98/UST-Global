package com.dev.threads;

public class T1 {
	
	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		
	/*	new T2().start();
		
		new Thread(new T3()).start();*/
		
		Thread2 t2 =new Thread2();
		t2.setName("thread T2");
		t2.setPriority(3);
		t2.start();
		
		Thread3 t3=new Thread3();
		
		
		Thread t= new Thread(t3);
	
		t.setPriority(5);
		t.start();
		Thread.currentThread().setName("Main Thread");
		System.out.println("Thread t2 name = "+t2.getName());
		
		//Xt.start();
		for (int i=1;i<=10;i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("Thread name = ");
		
		System.out.println("main thread terminated");
		
		System.out.println("Thread 2 id = "+t2.getId());
		
		System.out.println("Thread 3 id = "+t.getId());
		
		System.out.println("Thread 2 priority = " +t2.getPriority());
		
		System.out.println("Thread 3 priority = " +t.getPriority());
	}
}
