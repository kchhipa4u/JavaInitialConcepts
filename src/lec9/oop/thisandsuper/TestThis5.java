package lec9.oop.thisandsuper;

class Studentt {
	int rollno;
	String name, course;
	float fee;

	Studentt(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Studentt(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

public class TestThis5 {
	public static void main(String args[]) {
		Studentt s1 = new Studentt(111, "ankit", "java");
		Studentt s2 = new Studentt(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}
