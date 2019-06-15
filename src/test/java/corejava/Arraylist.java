package corejava;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String args[]) {
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("bhavya");
		a.add("hello");
		System.out.println(a);
		a.add(1, "hiee");
		System.out.println(a);
		/*a.remove(1);
		a.remove("hello");
		System.out.println(a);*/
		System.out.println(a.get(2));
		//Testing
		System.out.println(a.contains("hello"));
		System.out.println(a.indexOf("bhavya"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
