package lec8.oop.staticconcepts;

public class StaticStudentDemo {
	
	String name;
	int age;
	int rollNo;
	
	static int sum =0;
	
	public StaticStudentDemo(String name, int age, int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		
		sum = sum+1;
	}



	public static void main(String[] args) {
		
		StaticStudentDemo stu1 = new StaticStudentDemo("Tanishk", 15, 1);
		StaticStudentDemo stu2 = new StaticStudentDemo("Rohan", 16, 2);
		StaticStudentDemo stu3 = new StaticStudentDemo("Ajay", 15, 3);
		StaticStudentDemo stu4 = new StaticStudentDemo("Kanhaiya", 16, 4);
		StaticStudentDemo stu5 = new StaticStudentDemo("Parth", 15, 5);
		
		System.out.println("Total number of students in class " + sum);
		
	}
	
}
