package lec11.oop.inheritance.p1;

public class Son extends Father {
	
	public static void main(String[] args) {
		//System.out.println("privateMember: " + privateMember);
		// Inherited members are directly accessible
		System.out.println("defaultMember: " + defaultMember);
		System.out.println("protectedMember: " + protectedMember);
		System.out.println("publicMember: " + publicMember);
	}
}