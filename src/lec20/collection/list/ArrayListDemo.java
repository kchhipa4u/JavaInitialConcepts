package lec20.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> items = new LinkedList<>();
		items.add("Apple");
		items.add("Apple");
		items.add("banana");
		items.add("a1");
		items.add("a2");
		items.add("a3");
		items.add("a4");
		items.add("a5");
		items.add("a6");
		items.add("a7");
		items.add("a8");
		items.add("Apple");
		items.add("a10");
		items.add("a11");
		items.add("a12");
		items.add("a13");
		items.add("a14");
		items.add(null);
		items.add("");
		
		
		System.out.println(items);
		
		
	}
}
