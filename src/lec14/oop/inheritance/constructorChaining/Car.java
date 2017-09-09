package lec14.oop.inheritance.constructorChaining;

/**
 * @author kanhaiya.chhipa
 * 
 *   Req 1 :- If I don't provide ant color and company  -> BLACK, MARUTI
 *   
 *   Req 2 :- If I provide you Company Name, but not color -->   name,  BLACK
 *   
 *   Req 3 :- company, and color also
 *   
 *   Constructor supports overloading
 *
 */
public class Car {

	String color;   // null

	String company;   // null

	Car() {
		   this("Maruti", "BLACK");
	}
	
	Car(String company) {
		this(company, "BLACK");
	}
	
	Car(String company, String color) {
		this.color = color;
		this.company = company;
	}

	/*Car(String company) {
		this(company, "BLACK");
	}

	Car(String company, String color) {
		this.color = color;
		this.company = company;
	}*/

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.color);
		System.out.println(c1.company);

		Car c2 = new Car("Honda");
		System.out.println(c2.color);
		System.out.println(c2.company);

		Car c3 = new Car("FIAT", "RED");
		System.out.println(c3.color);
		System.out.println(c3.company);
	}
}
