package lec15.oop.interfaces;


/**
 * @author kanhaiya.chhipa
 * 
 * Interface is defined with keyword interface
 * 
 * It consists 2 things
 *    1. variable  :- public, static, and final
 *    2. method declaration only :- public, and abstract
 *    3. An interface can extend more than one parent interface. 
 *       The extends keyword is used once, and the parent interfaces are declared in a comma-separated list.
 *    4. You can't create an instance of interface because it does not have constructor
 *    5. No restriction around parameter
 *    
 *  Java does not supports multiple inheritance, but it could be achieved using Interface
 *
 */
// class Class_Name
public interface InterfaceBasicConcepts {	
	
	/**
	 * interface can only have variables like public static final. Other modifiers are not allowed.
	 * final :- if applied with variables then we cannot change the value of that variable
	 */
	public static final int x =5;
	
	/**
	 * if we do not put public static final with variables then JVM will automatically append these.
	 */
	int y = 10;
	
	/**
	 * I can only declare the method not define the method, and we append abstract keyword with the method
	 */
	public abstract void method1();  //Contract
	
	/**
	 * cannot define the method
	 */
	/*public void method2(){
		
	}*/
	
	
	/**
	 * JVM will append the abstract, and public keywords if we do not write with method
	 */
	void method2();
	
}
