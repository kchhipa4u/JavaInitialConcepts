package lec11.oop.inheritance.p1;

import lec11.oop.inheritance.p2.Daughter;

public class Uncle {
	public static void main(String[] args) {
		//System.out.println("A1.privateMember: " + A1.privateMember);
		
		System.out.println("Father.defaultMember: " + Father.defaultMember);
		System.out.println("Son.defaultMember: " + Son.defaultMember);
		//System.out.println("Daughter.defaultMember: " + Daughter.defaultMember);
		
		System.out.println("Father.protectedMember:" + Father.protectedMember);
		System.out.println("Son.protectedMember: " + Son.protectedMember);
		System.out.println("Daughter.protectedMember: " + Daughter.protectedMember);
		
		System.out.println("Father.publicMember: " + Father.publicMember);		
		System.out.println("Son.publicMember: " + Son.publicMember);
		System.out.println("Daughter.publicMember: " + Daughter.publicMember);
	}
}
