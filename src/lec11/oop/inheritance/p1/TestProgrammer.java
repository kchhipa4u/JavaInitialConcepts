package lec11.oop.inheritance.p1;

public class TestProgrammer {

	public static void main(String[] args) {
		Programmer p1 = new Programmer();  // creating an object Child Class
		
		// I want to call Parent 
		//p1.setName("Madhu");
		p1.setAddress("Ocean Park");
		System.out.println(p1.getAddress());
		//System.out.println(p1.useParentMetohd());
		
		Employee e1 = new Employee();
		//e1.
	}
}
