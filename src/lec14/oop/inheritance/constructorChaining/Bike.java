package lec14.oop.inheritance.constructorChaining;

// Super and This keyword must be first line of constructor
public class Bike extends Vehicle {

	String brand;
	
	Bike(){
		//super("BLACK");
		//this("HONDA");
		this.color = "rbb";
		System.out.println("Car...");
	}
	
	public Bike(String brand)
	{
		super("YELLO");
		this.brand = brand;
	}
    
	/*public Bike(String brand, String color) {
		//super(color);
		
		this.color = color;
		this.brand = brand;
	}*/
	
	void getColor(){
		System.out.println(color);
	}
	
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		System.out.println(b.color);
		System.out.println(b.brand);
		
		Bike b2 = new Bike("Honda");
		System.out.println();
		
		
		
		//Bike b1 = new Bike("Honda", "RED");
		
		
		/*System.out.println(b1.color);
		System.out.println(b1);*/
	}

}
