package lec20.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		//
		
		linkedList.add("Ind");
		linkedList.add("Aus");
		linkedList.add("SA");
		linkedList.add(null);
		
		System.out.println(linkedList.get(2));
		
		//System.out.println(linkedList);
		
		//linkedList.addFirst("SL");
		
		//System.out.println(linkedList);
		
		//linkedList.addLast("NZ");
		
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		Iterator<String> iterator = linkedList.iterator();
		
		 while(iterator.hasNext()){
		 //System.out.println(iterator.next());
			 iterator.next();
		     //iterator.remove();
		 }
		 
		 linkedList.clear();
		 
		 System.out.println(linkedList.size());
		
	}
}
