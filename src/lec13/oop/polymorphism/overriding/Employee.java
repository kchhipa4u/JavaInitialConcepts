package lec13.oop.polymorphism.overriding;

class Employee {
	
	public final void reachOffice() {
		System.out.println("reached office - Gurgaon, India");
	}

	protected void startProjectWork() {
		System.out.println("procure hardware");
		System.out.println("install software");
	}
}