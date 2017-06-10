package lec8.oop.staticconcepts;

public class StudentStaticDemo {

	String name;
	int rollNo;
	static int studentCount;
	
	/*{
		//studentCount++;
		studentCount = studentCount+1;
		
		System.out.println(studentCount);
	}*/
	
	
	public StudentStaticDemo(String stunameN, int stuRollNo) {
		name = stunameN;
		rollNo = stuRollNo;
		studentCount++;
		System.out.println(studentCount);
		
	}
	
	private void disp() {
		int aa = 5;

	}
	
	
	
	public static void main(String[] args) {
		
		
		
		StudentStaticDemo stu1 = new StudentStaticDemo("Anil", 1);
		StudentStaticDemo stu2 = new StudentStaticDemo("Madhu", 2);
		StudentStaticDemo stu3 = new StudentStaticDemo("Kanhaiya", 3);
		
		
	}
	
	
}
