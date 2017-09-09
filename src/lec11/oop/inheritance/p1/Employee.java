package lec11.oop.inheritance.p1;

public class Employee {
	
	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// default, protected
	public static void main(String[] args) {
		Parent p = new Parent();
		
		NewChild nc = new NewChild();
		//nc.
		//p.
	}
	
}
