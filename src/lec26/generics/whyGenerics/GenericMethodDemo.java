package lec26.generics.whyGenerics;

class GenericMethod{
	
	public <T> void showITem(T t){
		System.out.println(t.toString());
	}
	
	public <T> T showAnother(T t){
		return t;
	}
	
	public <T> void showYetAnother(T[] items){
		for(T item : items)
		{
			System.out.println(item);
		}
	}
	
}

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		gm.showITem("KAN");
		gm.showITem(25);
		
		System.out.println(gm.showAnother("Anil"));
		System.out.println(gm.showAnother(70));
		
		Integer[] items = {5, 6, 7, 1, 9};
		gm.showYetAnother(items);
	}
}
