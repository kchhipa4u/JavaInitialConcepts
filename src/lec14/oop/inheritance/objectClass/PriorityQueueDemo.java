package lec14.oop.inheritance.objectClass;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<>();
		
		p.add("dishes");
		p.add("laundry");
		p.add("bills");
		p.add("bills");
		
		System.out.println(p.size() +" "+ p.poll());
		System.out.println(p.peek() +" "+ p.poll());
		System.out.println(p.poll() +" "+ p.poll());
	}
}
