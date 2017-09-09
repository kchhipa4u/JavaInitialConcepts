package lec13.oop.polymorphism.overriding.covariant;

public class ClientPrivateConstructor {

	public static void main(String[] args) {
		//PrivateConstructor p = new ClientPrivateConstructor();
		PrivateConstructor p = PrivateConstructor.getInstance();
		p.m1();
	}
}
