package lec17.exceptions.fundamentals;

public class ArrayExcess {

	public static void main(String[] args) {

		try {
			String[] students = { "Anil", "Madhu", "Kanhaiya", null };

			System.out.println(students[0]);

			// Runtime Exception
			System.out.println(students[5]);
			
			System.out.println("Come here....");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Log that error
			//generate new page, and print like System is not available, plz contact
           // I am handling that exception
			e.printStackTrace();
			System.out.println("In catch block " + e);
		}

		System.out.println("Program Continue.....");

	}
}
