package com.deev.encapsulation;

public class TestPets {

	public static void main(String[] args) {
		Dogs d = new Dogs();
		Dogs d1 = new Dogs();
		Cat c = new Cat();
		Cat c1 = new Cat();
		Cow cow = new  Cow();
		Cow cow1 = new Cow();
		
		d.setAge(1);
		d.setName("sam");
		
		d1.setAge(2);
		d1.setName("hamem");
		
		c.setAge(1);
		c.setName("sugam");
		
		c1.setAge(2);
		c1.setName("tango");
		
		cow.setAge(5);
		cow.setName("Kaveri");
		
		cow1.setAge(6);
		cow1.setName("Gowri");
		
		Dogs[] dog ={d,d1};
		
		Cat[] cat = {c,c1};
		
		Cow[] cow2 = {cow,cow1};
		
		for(int i = 0;i<dog.length;i++){
			System.out.println(dog[i].getAge());
			System.out.println(dog[i].getName());
		}
		
		for(int i = 0;i<cat.length;i++){
			System.out.println(cat[i].getAge());
			System.out.println(cat[i].getName());
		}
		
		for(int i = 0;i<cow2.length;i++){
			System.out.println(cow2[i].getAge());
			System.out.println(cow2[i].getName());
		}
		
	}
}
