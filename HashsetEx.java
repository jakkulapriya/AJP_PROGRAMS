package AJPJAVA;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

	public static void main(String[] args) {
		HashSet hs = new HashSet();//hashset which doesnot contain any order
		hs.add("java");//order is not maintained
		hs.add(10);
		hs.add(null);//null values are allowed
		hs.add(60.8f);
		hs.add(12);
		System.out.println(hs);
		
		System.out.println("size:"+hs.size());
		System.out.println("remove:"+hs.remove(11));
        
		HashSet hs1 = new HashSet();
		hs1.add(43);hs1.add(52);

		//		System.out.println(hs.addAll(hs1));
//		System.out.println(hs);
//        
//		System.out.println(hs);
//		System.out.println(hs1);
//		hs.retainAll(hs1);
//		System.out.println(hs);
		
		System.out.println(hs);
		System.out.println(hs1);
		hs.removeAll(hs1);
		System.out.println(hs);
		System.out.println(hs1);
		
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(hs.containsAll(hs1));
		
		
	}

}
