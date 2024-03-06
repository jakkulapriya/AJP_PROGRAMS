package AJPJAVA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashmapEx {

	public static void main(String[] args) {
//		HashMap hm = new HashMap<>();
//		hm.put(1, "priya");
//		hm.put(34, "priya");
//		hm.put("divi", "priya");
//		System.out.println(hm);
		
		//***** these are 3 different collection frameworks
		
	//HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		
	//TreeMap<Integer,String> hm = new TreeMap<Integer,String>();//treemap which is sets in sorting order
		hm.put(1, "priya");
		hm.put(1, "priya");
		hm.put(6, "hima");//in hashmap we can not use (add retain remove) and some of operations
		hm.put(3,"divi");
		System.out.println(hm);
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		
		
		Set<Integer>set1=hm.keySet();
		HashSet<Integer>hs1=new HashSet<Integer>(set1);
		Iterator i = hs1.iterator();
		while(i.hasNext()) {
			Object key =(Integer) i.next();
			System.out.println(key+":"+hm.get(key));
		}
		System.out.println(hm.containsKey(3));//to check the given value is present in hashmap or not
		System.out.println(hm.containsValue("priya"));
		
	}

}