package lec13.oop.polymorphism.overriding;

public class User {
   public int id = 1;
	
   public void printUserType() {
	   System.out.println("User");
   }
   
   public void saveWebLink() {
	   System.out.println("User: saveWebLink");
	   //postAReview();
   }
}