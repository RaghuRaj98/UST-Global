package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class C2 {
	public static void main(String[] args) {
		HashSet<Employee> emp= new HashSet<Employee>();
		TreeSet<Employee> emp1=new TreeSet<Employee>();
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
		
		
		emp.add(e1);
		emp.add(e2);
		System.out.println(emp);
		System.out.println("Output of remove(e1) = "+emp.remove(e1));
		System.out.println("Output of contains(e2) = "+emp.contains(e2));
		System.out.println("Output of contains(e1) = "+emp.contains(e1));
		System.out.println("Output of size() = "+emp.size());
		
	}
}
