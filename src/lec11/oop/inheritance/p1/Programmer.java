package lec11.oop.inheritance.p1;

public class Programmer extends Employee {

	private String[] programmingLanguages;

	public String[] getProgrammingLanguages() {
		return programmingLanguages;
	}

	public void setProgrammingLanguages(String[] programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}
	
	public String useParentMetohd(){
		return getAddress();
	}
}
