package Collection;

import java.util.ArrayList;

public class ArrayLi {
	static int d =0101;
	
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();

		Employee e1 = new Employee();

		e1.setName("Raj");
		e1.setEmail("raja@mail");
		e1.setId(1);
		e1.setPassword("skjsd;kjj");

		Employee e2 = new Employee();

		e2.setName("Raghu");
		e2.setEmail("raghu@mail");
		e2.setId(2);
		e2.setPassword("dnfnf;kjj");

		Employee e3 = new Employee();

		e3.setName("Rao");
		e3.setEmail("ram@mail");
		e3.setId(2);
		e3.setPassword("dnfnf;kjj");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println(emp);
		
		System.out.println("Size of employee detail = "+emp.size());
		
		System.out.println(d);
	}
}
