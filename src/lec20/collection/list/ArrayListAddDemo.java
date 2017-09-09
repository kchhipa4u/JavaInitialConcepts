package lec20.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ArrayListAddDemo {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1); // autoboxing and un-boxing // 1 -> new Integer(1)
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);

		// numbers.add(4, 2); // update operation
		// remove operation can be performed from index and element both
		/*
		 * numbers.remove(new Integer(2)); numbers.remove(2);
		 */

		System.out.println(numbers.get(2));
		System.out.println("Total size " + numbers.size());

		// System.out.println(numbers);

		// 1. Iterator

		Iterator<Integer> iterator = numbers.iterator();

		/*
		 * while(iterator.hasNext()){ System.out.println(iterator.next());
		 * 
		 * //numbers.add(10); }
		 */

		// 2. Enumeration
		/*Enumeration<Integer> listEnum = Collections.enumeration(numbers);
		while (listEnum.hasMoreElements()) {
			System.out.println(listEnum.nextElement());
		}*/

		// 3. advance for loop
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		
		
		//addProduct(numbers);
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		
		numbers.clear();
		
		System.out.println("Empty List " + numbers);

	}
	
}
