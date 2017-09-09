package lec26.generics.whyGenerics;

class DemoClass {
	private Object item;

	public void set(Object item) {
		this.item = item;
	}

	public Object get() {
		return item;
	}

	@Override
	public String toString() {
		return "DemoClass [item=" + item + "]";
	}

}

public class DemoTest {

	public static void main(String[] args) {
		DemoClass d = new DemoClass();
		// no problem to store any type of item
		d.set(45);
		System.out.println(d);

		d.set("Anil");
		System.out.println(d);

		// Problem in retrieval of elements. We need to type case to get the
		// item and that is
		// not a good way.

		String name = (String) d.get();
	}

}