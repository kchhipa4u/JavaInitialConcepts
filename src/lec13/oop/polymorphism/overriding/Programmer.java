package lec13.oop.polymorphism.overriding;

class Programmer extends Employee {
	public void startProjectWork() {
		defineClasses();
		unitTestCode();
	}

	private void defineClasses() {
		System.out.println("define classes");
	}

	private void unitTestCode() {
		System.out.println("unit test code");
	}
}