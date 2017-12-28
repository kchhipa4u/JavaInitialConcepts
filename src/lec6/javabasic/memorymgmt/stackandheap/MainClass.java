package lec6.javabasic.memorymgmt.stackandheap;

class StaticComponents
{
     static int staticVariable;
 
     static
     {
          System.out.println("StaticComponents SIB");
          staticVariable = 10;
          System.out.println("staticVariable in StaticComponents class: "+staticVariable);
     }
 
     static void staticMethod()
     {
          System.out.println("From StaticMethod");
          System.out.println(staticVariable);
     }
}
 
public class MainClass
{
     static
     {
          System.out.println("MainClass SIB");
     }
 
     public static void main(String[] args)
     {
         //Static Members directly accessed with Class Name
          StaticComponents.staticVariable = 20;
          StaticComponents.staticMethod();
     }
}