package com.dev.threads;

public class T4 extends Thread{

	PrinterWithoutSynchronized p;
	
	public T4(PrinterWithoutSynchronized pref)
	{
		p = pref;
	}
	@Override
	public void run() {
	
		p.printVal(10,"Thread4");
	}
}
