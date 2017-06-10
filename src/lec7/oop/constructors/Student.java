package lec7.oop.constructors;

public class Student {
	// Instance variable
	int id;      // 0
	String name;     // null
	
	// Constructor name must be same of class name..
	// Instance / Object
	public Student() {
		System.out.println("I am constructor");
		id =5;
		name = "Madhu";
		System.out.println(id);
		System.out.println(name);
	}
	// no-arg constructor
	/*public Student() {}*/
	
	/*public Student() {
	 int id;	
	}*/
	// Instance block
	{
		id = 10;
		name = "Anil";
		System.out.println("Inside instance block");
		System.out.println(id);
		System.out.println(name);
	}
	public Student(int stuId, int stuName) {
		  id = stuId;	
		  System.out.println(id);
		  System.out.println(name);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		// inside main
		System.out.println("inside main");
		System.out.println(s.id);
		System.out.println(s.name);
		
		
		
	}

}
