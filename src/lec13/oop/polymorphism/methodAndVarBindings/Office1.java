package lec13.oop.polymorphism.methodAndVarBindings;

/**
 * @author kanhaiya.chhipa
 *
 *  Variables binded at compile time
 *  Methods binded at runtime.
 */
class Office1 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee programmer = new Programmer();  // Polymorhic way, run time
		
		System.out.println(emp.name);
		System.out.println(programmer.name);
		
		emp.printName();
		programmer.printName();
	}
}