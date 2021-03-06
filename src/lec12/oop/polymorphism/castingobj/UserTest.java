package lec12.oop.polymorphism.castingobj;
public class UserTest {
	
	public void printUserType(User u) {
	    u.printUserType();
	}
	
	public void approveReview(Staff s) {
		//((Editor) s).approveReview(); 

		if (s instanceof Editor) {
			((Editor) s).approveReview(); 
        } else {
        	System.out.println("Invalid object passed!!");
        }
	}

	
	public static void main(String[] args) {
		// Part 1
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		
		UserTest ut = new UserTest();
		//ut.printUserType(user);
		//ut.printUserType(staff);
		//ut.printUserType(editor);
		
		// Part 2
	    ((Editor) editor).approveReview();
		//editor.postAReview();
		//editor.saveWebLink();	
		
		// Casting & instanceof demo
		 //UserTest ut = new UserTest();
		   ut.approveReview(new Staff());    // Staff s = new Staff();
		//ut.approveReview(new Editor());	  // Staff s = new Editor();	
	}
}