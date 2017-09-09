package lec13.oop.polymorphism.overriding;

public class Review {
	private String reviewText;
	private boolean approved;
	
	public Review (String reviewText) {
		this.reviewText = reviewText;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
}
