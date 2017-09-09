package lec14.oop.inheritance.objectClass;

public class Tutor extends OnlineLearning implements I1, I2{

	
	public void learnLanguage(){
		System.out.println("Learining from College..");
	}

	public void m11() {
	}

	@Override
	public void m1() {
		System.out.println("I am method m1()...");
	}

	@Override
	public void m2() {
	}
	
	public static void main(String[] args) {
		Tutor t1 = new Tutor();
		//System.out.println(t1.x);
		System.out.println(I1.x);
		System.out.println(I2.x);
		
		//System.out.println(I);
	}
	
}
