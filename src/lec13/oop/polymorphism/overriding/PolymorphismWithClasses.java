package lec13.oop.polymorphism.overriding;

class PolymorphismWithClasses {
	public static void main(String[] args) {
		
		/*Employee e1 = new Employee();
		e1.reachOffice();
		e1.startProjectWork();*/
		
		/*Programmer p1 = new Programmer();
		p1.reachOffice();
		p1.startProjectWork();*/
		
		
		Employee emp1 = new Programmer();
		Employee emp2 = new Manager();
		emp1.reachOffice();
		emp1.startProjectWork();
		
		emp2.reachOffice();
		emp2.startProjectWork();
	}
}