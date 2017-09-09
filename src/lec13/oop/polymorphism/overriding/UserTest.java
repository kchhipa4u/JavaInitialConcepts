package lec13.oop.polymorphism.overriding;
public class UserTest {
	
	

	
	public static void main(String[] args) {
		
		User u = new Staff();
		
		// User u   -> printUserType(), saveWebLink()
		
		//new Staff()  -> Can not call approveReview() of Staff
		              // -> printUserType(), saveWebLink() of Staff class wud get called
		
		u.printUserType();
		
		// Explicit Type Casting
		((Staff) u).approveReview();
	}
}