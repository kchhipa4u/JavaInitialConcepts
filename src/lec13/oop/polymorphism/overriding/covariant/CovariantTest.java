package lec13.oop.polymorphism.overriding.covariant;

class Vehicle {
	public Vehicle getInstance() {
		//return new Vehicle();
		return this;
	}
}

class Van extends Vehicle {
	// Covariant return type in action!!!
	public Van getInstance() {
		return this;
	}

	public void move() {
		System.out.println("Van is moving ...");
	}
}

public class CovariantTest {
	public static void main(String... args) {
		new Van().getInstance().move();
	}
}