package lec21.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainClass
{
    public static void main(String[] args)
    {
        //Creating LinkedHashSet
 
        LinkedHashSet<Customer> set = new LinkedHashSet<Customer>();
        
        set.add(new Customer("Kanhaiya", 1));
        
        set.add(new Customer("Anil", 2));
 
        set.add(new Customer("Madhu", 3));  
        
        set.add(new Customer("Anil", 2));
        
 
        //Adding elements to LinkedHashSet
 
       /* set.add(new Customer("Jack", 021));
 
        set.add(new Customer("Peter", 105));
 
        set.add(new Customer("Ramesh", 415));    
 
        set.add(new Customer("Julian", 814));
 
        set.add(new Customer("Avinash", 105));      //Duplicate Element
 
        set.add(new Customer("Sapna", 879));
 
        set.add(new Customer("John", 546));
 
        set.add(new Customer("Moni", 254));
 
        set.add(new Customer("Ravi", 105));     */   //Duplicate Element
 
        //Getting Iterator object
 
        Iterator<Customer> it = set.iterator();
 
        while (it.hasNext())
        {
            Customer customer = (Customer) it.next();
 
            System.out.println(customer);
        }
    }
}