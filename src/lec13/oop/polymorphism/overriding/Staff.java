package lec13.oop.polymorphism.overriding;

public class Staff extends User {
	public int id = 2;	
	public void printId() {
		System.out.println("id: " + id);
		System.out.println("super.id: " + super.id);
	}
	
	public void printUserType() {
		System.out.println("Staff");
	}
	
	public void saveWebLink() {
		   System.out.println("Staff: saveWebLink");
		   //postAReview();
	}
	
	public void approveReview(){
		System.out.println("Review is approved...");
	}
}