package lec16.oop.interfaces.defaultandstaticmethod;
public class App3 implements E, F {
   @Override
    public void doIt() {
	  // super();
	  // this();
	   // super,  this
	   
       E.super.doIt();
	   //System.out.println("Inside App3...");
    }

    public static void main(String[] args) {
        new App3().doIt();
    }
}

interface E {
    default void doIt() {
        System.out.println("inside E");
    }
    
    static void abc(){
    	
    }
    
}

interface F {
    default void doIt() {
        System.out.println("inside F");
    }
}