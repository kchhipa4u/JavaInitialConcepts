package lec26.generics.wildcard;

import java.util.List;

public class Fruit {

	String name;
	
	public Fruit(String name) {
		this.name = name;
	}

	/*public void processElements(List<Fruit> elements) {
		for (Fruit o : elements) {
			System.out.println(o.getValue());
		}
	}*/

	private String getValue() {
		return name;
	}
	
	/*public void processElements(List<?> elements) {
		//elements.add(new Apple("a2"));  // insertion is not possible here
		
		for (Object o : elements) {
			System.out.println(o);
		}
	} */
	
	public void processElements(List<? extends Fruit> elements) {
		elements.add(new Apple("apple2"));
		elements.add(null);
		elements.add(new Fruit("fff4"));
		
		for (Fruit a : elements) {
			System.out.println(a.getValue());
		}
	}
	
	/*public void processElements(List<? super Fruit> elements) {
		//elements.add(new Apple("apple2"));
		elements.add(new Fruit("ff1"));
		//elements.add((Fruit) new Object());
		elements.add(new Apple("aaaa2"));
		
	    for (Object a : elements) {
			System.out.println(a);
		}
	}
*/	

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
}
