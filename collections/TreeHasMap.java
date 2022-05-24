package collections;

import java.util.*;

public class TreeHasMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> obj=new TreeMap<Integer,String>(); 
		obj.put(5, "Laptop"); 
		obj.put(4, "Book")  ;
		obj.put(3, "Mobile"); //TreeMap it gives ascending order o/p
		obj.put(2, "Clock") ;
		obj.put(1, "Modem") ;

	//System.out.println(obj);
		
		for(Map.Entry<Integer,String> map:obj.entrySet() ) {
			System.out.println(map.getKey()+","+map.getValue());
		}
	}
	
	
}

