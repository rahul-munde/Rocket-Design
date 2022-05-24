package collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> obj=new HashMap<Integer,String>(); 
		obj.put(4, "Laptop"); //HasMap Not Maintain the order
		obj.put(1, "Book")  ;
		obj.put(3, "Mobile"); //value not important but key is very imp i.e1,2...insertion order
		obj.put(2, "Clock") ;
		obj.put(5, "Modem") ;
		obj.put(5, "Router") ; //Duplicates allowed last updated data shows

	//System.out.println(obj);
		
		for(Map.Entry<Integer,String> map:obj.entrySet() ) {
			System.out.println(map.getKey()+","+map.getValue());
		}
	}
	
	
}
