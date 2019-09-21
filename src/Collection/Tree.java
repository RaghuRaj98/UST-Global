package Collection;

import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
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
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		System.out.println(ts);
	}
}
