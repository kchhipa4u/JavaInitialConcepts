package lec16.oop.abstractdemo;

/**
 * @author kanhaiya.chhipa
 * 
 * 1. abstract class must have abstract keyword with it.
 * 
 * 2. There is no need to override any Interface method. 
 * 
 * 3. We can not create an object of abstract class.
 * 
 * Abstract Class = Interface + class
 * 
 * Abstract Class :- abstract class may or may not have abstract methods.
 * 
 * If any class have abstract method then that class must be Abstract class.
 * 
 * We can not create an object of abstract class.
 *
 */
public abstract class AbstractA implements I1 {
	
	abstract void m3();
	public abstract void m4();
	abstract void m5();
	
	private void m6(){
		System.out.println("I am m4()");
	}
   
}

abstract class B{
	
	abstract void mm1();
}

