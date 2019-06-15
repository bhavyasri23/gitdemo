package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String args[]) {
		
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("Pak");
		hs.add("Aus");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("UK"));
		System.out.println(hs.size());
	
	//Iterator
	Iterator<String> i=hs.iterator();
	System.out.println(i.next());
	System.out.println(i.next());
	while(i.hasNext())
	{	
		
		System.out.println(i.next());
		
	}
	
	}

}
