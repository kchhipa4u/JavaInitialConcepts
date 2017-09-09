package lec23.collection.tree;

import java.util.TreeSet;

public class TreeSetExampleOnDissimilarObject
{
    public static void main(String[] args)
    {
        //Creating a TreeSet
 
        TreeSet<Object> set = new TreeSet<Object>();
 
        //Adding elements to TreeSet
 
        set.add("kkk");      //inserting String type element
 
        set.add(10);        //inserting Integer type element
 
        set.add(new Object());      //inserting Object type element
 
        set.add(20.65);     //inserting Double type element
 
        //The elements inserted are not mutually comparable. So, it will throw ClassCastException.
        
        System.out.println(set);
    }
}