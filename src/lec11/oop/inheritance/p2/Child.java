package lec11.oop.inheritance.p2;

import org.apache.commons.lang.BooleanUtils;

import lec11.oop.inheritance.p1.Parent;

public class Child extends Parent{

	// public xyz()
	
	// private display()  {can not accessible to other classes in same package}
	
	   public void chMethod(){
		   display();
	   }
	   
	   
	public static void main(String[] args) {
		//System.out.println(BooleanUtils.toBooleanObject("false"));
		Boolean result = BooleanUtils.toBooleanObject("") != null ? BooleanUtils.toBooleanObject("") : null;
		System.out.println(result);
	   Child c = new Child();
		c.display();
		//Parent p = new Parent();
		//p.
	}
}
