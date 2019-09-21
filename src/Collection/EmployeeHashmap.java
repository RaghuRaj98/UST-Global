package Collection;

import java.util.HashMap;

public class EmployeeHashmap implements EmpEx{
	HashMap<String, Employee> hash = new HashMap<String, Employee>();

	@Override
	public void getEmployee(String k) {
		System.out.println("This  is get method = "+hash.get(k));
	}

	@Override
	public void updateEmployee(String k, Employee e) {
		hash.put(k, e);

	}

	@Override
	public void deleteEmployee(String k, Employee e) {
		hash.remove(k);

	}

	@Override
	public void addEmployee(String k, Employee e) {
		Employee b1 = hash.put(k, e);
		
		System.out.println(b1);
	}
	
	public static void main(String[] args) {
		EmployeeHashmap emphash = new EmployeeHashmap();
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
		
		emphash.addEmployee("1", e1);
		emphash.addEmployee("2", e2);
		
		emphash.addEmployee("1", e1);
		emphash.addEmployee("2", e2);
		
		emphash.getEmployee("1");
		System.out.println("hi done");
	}

	

}
