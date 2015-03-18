package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collections {

	static List<Integer> ll; 
	static Set<Integer> s;
	static HashMap<Integer,String> h ;
	public void add(){
		ll = new ArrayList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		Iterator<Integer> iter = ll.iterator();
		while(iter.hasNext()){		
			System.out.println(iter.next());
		}
		//Set will replace the value; whereas add at a particular index will append to the list at the specified location.
	}
	
	public void put(){
		s = new HashSet<Integer>();
		s.add(1);
	}
	public  void addHashMap(){
		h = new HashMap<Integer,String>();
		h.put(1, "Hello");
		h.put(2, "World");
		h.keySet();
		Iterator<Integer> iter_keys = h.keySet().iterator();
		//Iterator iter_values =  h.values();
		while(iter_keys.hasNext()){
			Object key = iter_keys.next();
			System.out.println(h.get(key));
		}
		
	}
	public static void main(String args[]){
		Collections c = new Collections();
		//c.add();
		c.addHashMap();
	}
}
