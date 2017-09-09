package lec13.oop.polymorphism.overriding.covariant;

public class PrivateConstructor {

	private static PrivateConstructor mynstance = new PrivateConstructor();
	
	private PrivateConstructor() {
        System.out.println("I am private constructor...");
	}
	
	public static PrivateConstructor getInstance()
	{
		//return new PrivateConstructor();
		
		return mynstance;
	}
	
	public void m1()
	{
		System.out.println("I am m1()...");
	}
	
}
