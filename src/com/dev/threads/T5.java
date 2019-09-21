package com.dev.threads;

public class T5 extends Thread{

	PrinterWithoutSynchronized p;
	
	public T5(PrinterWithoutSynchronized pref)
	{
		p = pref;
	}
	@Override
	public void run() {
		p.printVal(10,"Tread 5");
	}
}
