package lec26.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class TestFruit {

	public static void main(String[] args) {

		List<Fruit> fruitList = new ArrayList<>();

		Fruit f1 = new Apple("al");
		Fruit f2 = new Apple("a2");
		Fruit f3 = new Banana("b1");

		fruitList.add(f1);
		fruitList.add(f2);
		fruitList.add(f3);

		List<Apple> appleList = new ArrayList<>();

		Apple a1 = new Apple("aa1");
		appleList.add(a1);
		
		fruitList.add(new Apple("aa2"));
	}
}
