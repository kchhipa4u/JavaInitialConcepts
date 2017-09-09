package lec20.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteALDemo {



	public static void main(String[] args) {
		
		List<Integer> numbers = new CopyOnWriteArrayList<>();
		numbers.add(1);  
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);
		
		Iterator<Integer> iterator = numbers.iterator();
		int count = 0;
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			if(count == 0)
			  numbers.add(10);
			
			count++;
			
			//System.out.println(numbers.get(4));
		}
		
		//System.out.println(numbers);
		
	}

}
