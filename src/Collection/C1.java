package Collection;

import java.util.HashSet;

import com.deev.encapsulation.Dogs;

public class C1 {
	public static void main(String[] args) {
		HashSet<Dogs> hash = new HashSet<Dogs>();
		
		Dogs d = new Dogs();
		
		d.setAge(1);
		d.setName("D M");
		
		Dogs d1= new Dogs();
		
		d1.setAge(2);
		d1.setName("Dalmition");
		
		Dogs d2= new Dogs();
		
		d2.setAge(3);
		d2.setName("Dalmn");
		 boolean b = hash.add(d);
		 boolean b1 = hash.add(d1);
		 boolean b5 = hash.add(d2);
		 System.out.println("Output of add = "+ b+"    " + b1);
		 
		 System.out.println(hash);
		 System.out.println("size of  hashset = "+ hash.size());
		 boolean b2 = hash.remove(d);
		 
		 System.out.println(hash);
		 
		 System.out.println("size of  hashset after remove = "+ hash.size());
		 boolean b4 = hash.contains(d2);
		 System.out.println("output of contains = "+b4);
		 
		 hash.clear();
		 System.out.println("size of  hashset after clear = "+ hash.size());
	}
}
