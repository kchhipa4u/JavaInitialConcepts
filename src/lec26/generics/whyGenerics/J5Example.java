package lec26.generics.whyGenerics;

import java.util.ArrayList;

public class J5Example {
 
   public static void main(String[] args) {
        
       // Create a list, aim to contain usernames
       ArrayList<String> userNames = new ArrayList<String>();
 
        // Add string to list
       userNames.add("tom");
       userNames.add("jerry");
 
        // You can not add an element not a String
       userNames.add(new Integer(100)); // Compile Error!
 
       // You do not need to cast.
       String userName1 = userNames.get(0);
 
       System.out.println("userName1 = " + userName1);
 
   }
 
}