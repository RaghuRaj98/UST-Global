package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Collections {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.size());
		System.out.println(list.get(0));
		for (Integer i : list) {
			System.out.println(i);
		}
		
		List<String> stringlist = new LinkedList<String>();
		
		stringlist.add("Raghu");
		System.out.println(stringlist.contains("Raghu"));
		
		Vector<String> vect = new Vector<String>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
	}
}
