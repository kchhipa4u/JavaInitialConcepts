package lec12.oop.polymorphism.castingobj;

public class Staff extends User {
	public void printUserType() {
		System.out.println("Staff");
	}
	
	public void postAReview() {
	   System.out.println("Staff: postAReview");
	}
}