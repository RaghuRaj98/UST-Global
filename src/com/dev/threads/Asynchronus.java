package com.dev.threads;

public class Asynchronus {
	public static void main(String[] args) {
		System.out.println("ASync Thread Started ....");

		PrinterWithoutSynchronized p = new PrinterWithoutSynchronized();



		T4 t4 = new T4(p);

		t4.setPriority(7);
		t4.start();
		
		

		/*try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		T5 t5 = new T5(p);
		t5.setPriority(10);
		t5.start();
		
		
		


		System.out.println("ASyncMain Thread terminated.......");
	}
}
