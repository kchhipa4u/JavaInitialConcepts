package lec26.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Juice {

	public static void main(String[] args) {
		List<Fruit> fruitList = new ArrayList<>(); 
		List<Apple> appleList = new ArrayList<>();
		
		//fruitList = appleList;
		//appleList = fruitList;
		
		Fruit f1 = new Fruit("Fruit1");
		Fruit f2 = new Fruit("Fruit2");
		fruitList.add(f1);
		fruitList.add(f2);
		fruitList.add((Fruit) new Object()); // Generics
		//f1.processElements(fruitList);
		
		Apple a1 = new Apple("Apple1");
		appleList.add(a1);
		
		// List<Fruit> elements = appleList;
		
		f1.processElements(fruitList);
		
	}
}
