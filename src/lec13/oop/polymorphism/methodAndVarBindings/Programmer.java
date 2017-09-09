package lec13.oop.polymorphism.methodAndVarBindings;

class Programmer extends Employee {
	String name = "Programmer";

	void printName() {
		System.out.println(name);
	}
}