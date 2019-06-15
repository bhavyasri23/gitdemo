package corejava;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableEx {
	
	public static void main(String args[]) {
		
		Hashtable<Integer,String> hm =new Hashtable<Integer,String>();
		hm.put(0,"Uk");
		hm.put(1, "USA");
		hm.put(34,"INDIA");
		hm.put(4, "Pak");
		hm.put(7, "AUS");
		
		System.out.println(hm.get(34));
	hm.remove(7);
		System.out.println(hm.get(7));
		
	Set sn	=hm.entrySet();
	
	Iterator it =sn.iterator();	
	
	while(it.hasNext()) 
	{	
Map.Entry	mp=(Map.Entry)it.next();
System.out.println(mp.getKey());
System.out.println(mp.getValue());
		
	}
		
	}

	
	

}
