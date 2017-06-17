package lec10.oop.boxedprimitive;
public class Autoboxing{
    public static void main(String[] args) {
          
    	// -128 ---- 0  --- 127 (Cached)
    	   Integer i1 = 3; //caches Integer object 
           Integer i2 = 3; //returns cached Integer object
           System.out.println(i1 == i2); //true
           
           
           Integer i3 = 300; //caches Integer object 
           Integer i4 = 300; //returns cached Integer object
           System.out.println(i3 == i4); //false
           
    }
}