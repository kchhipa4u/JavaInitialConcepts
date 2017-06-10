package lec7.oop.constructors;

public class User {

	int id;
	String name;
	int salary;
	
	public User(int userId, String userName) {
		id = userId;
		name = userName;
	}

	public User(int userId, String userName, int userSalary) {
		this(userId,userName);
		salary = userSalary;
	}
	
	/*public User(int userId, String userName, int userSalary) {
	    // this, must be the first statement
	    // we can't call it multiple times
	    // Constructor can't invoke itself.
		this(userId,userName);
		salary = userSalary;
	}*/
	
	
	public static void main(String[] args) {
		User instructor = new User(1002, "Kanhaiya", 50000);
		System.out.println("Name: " + instructor.name);
	 }
	
	
}
