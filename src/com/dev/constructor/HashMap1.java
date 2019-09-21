package com.dev.constructor;
import java.util.HashMap;

import Collection.Employee;

public class HashMap1 {
	public static void main(String[] args) {
		
		HashMap <String, Employee> hs = new HashMap<String, Employee> ();
		
		Employee e1 = new Employee();
		
		e1.setName("Raj");
		e1.setEmail("raj@mail");
		e1.setId(1);
		e1.setPassword("skjsd;kjj");
		
		Employee e2 = new Employee();
		
		e2.setName("Raghu");
		e2.setEmail("raghu@mail");
		e2.setId(2);
		e2.setPassword("dnfnf;kjj");
		
		e1.setEmail("ram@mail");
		
		hs.put("1", e1);
		hs.put("2", e2);
		
		
	
	}
}
