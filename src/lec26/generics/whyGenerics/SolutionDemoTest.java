package lec26.generics.whyGenerics;

class Store<T> {
	// T stands for "Type"

	private T item;

	public void set(T item) {
		this.item = item;
	}

	public T get() {
		return item;
	}

	@Override
	public String toString() {
		return "DemoClass [item=" + item + "]";
	}

}

public class SolutionDemoTest {

	Store<String> s = new Store<>();
}
