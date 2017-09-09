package lec20.collection.list;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
    	
    	//Creating LinkedHashSet
 
        LinkedHashSet<String> set = new LinkedHashSet<String>();
 
        //Adding elements to LinkedHashSet
 
        System.out.println(set.add("JAVA"));
 
        set.add("J2EE");
        
        set.add("J2EE");
 
        set.add("STRUTS");
 
        set.add("JSP");
 
        set.add("JDBC");
 
        set.add("HIBERNATE");
 
        //Printing elements of LinkedHashSet
 
        System.out.println(set);     
 
        //Output : [JAVA, J2EE, STRUTS, JSP, JDBC, HIBERNATE]
 
        //Notice the order of elements. They are placed according to their insertion order.
    }
}