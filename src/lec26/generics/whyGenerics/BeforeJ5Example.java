package lec26.generics.whyGenerics;

import java.util.ArrayList;

public class BeforeJ5Example {
 
   public static void main(String[] args) {
 
       // Create a list, aim to contain usernames
       ArrayList userNames = new ArrayList();
 
       // Add username to list.
       userNames.add("tom");
       userNames.add("jerry");
 
 
       // You accidentally add an element not String to the list.
       // (This is allowed).
       userNames.add(new Integer(100));
 
 
       // And get the first element
       // It is an Object (But you know it is a String)
       // ==> Tom
       Object obj1 = userNames.get(0);
 
       // Cast to String.
       String userName1 = (String) obj1;
 
       System.out.println("userName1 = " + userName1);
 
 
       // And get the second element
       // (You know it is a String)
       // ==> jerry
       String userName2 = (String) userNames.get(1);
 
       System.out.println("userName2 = " + userName2);
 
      
       // Get the 3rd element (Actually it is an Integer).
       // (Error casts happen here).
       String userName3 = (String) userNames.get(2);
       //Integer userName3 = (Integer) userNames.get(2);
 
       System.out.println("userName3 = " + userName3);
   }
 
}