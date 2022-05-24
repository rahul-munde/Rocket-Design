package collections;

import java.util.*;

public class LinkedListHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> obj=new LinkedHashMap<Integer,String>(); 
		obj.put(4, "Laptop");    // LinkedHasMap Its maintain the order as given object reference
		obj.put(1, "Book")  ;
		obj.put(3, "Mobile"); 
		obj.put(2, "Clock") ;
		obj.put(5, "Modem") ;
		obj.put(5, "Router") ; 

	//System.out.println(obj);
		
		for(Map.Entry<Integer,String> map:obj.entrySet() ) {
			System.out.println(map.getKey()+","+map.getValue());
		}
	}
	
	
}
