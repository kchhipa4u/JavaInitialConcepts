package lec14.oop.inheritance.constructorChaining;

public class Vehicle {

	String color;
	
	public Vehicle(){
		System.out.println("Vehicle...");
		this.color = "RED";
	}

	public Vehicle(String color) {
		this.color = color;
	}
}
