package lec24.collection.map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
  
public class JavaHashMapExample 
{    
    public static void main(String[] args) 
    {
        //Defining the HashMap
         
        Map<String, Double> map = new HashMap<>();
         System.out.println(map.isEmpty());
        //Adding some elements to HashMap
         
        map.put("Ashwin", 87.55);
         
        map.put("Bharat", 95.65);
         
        map.put("Chetan", 87.55);
        System.out.println(map.isEmpty());
        map.put("Dhanjay", 74.23);
         
        System.out.println(map.put("Kartik", 65.42));
        map.putIfAbsent("Kartik", 75.42);
        //System.out.println(map.put("Kartik", 75.42)+" "+map.get("Kartik"));
         
        //HashMap can have one null key and multiple null values
         
        map.put(null, null);
         
        map.put("Sandesh", null);
        
        System.out.println(map.containsKey("Sandesh"));
        System.out.println(map.containsValue(68.13));
         
        //Getting the size of the map
         
        System.out.println("Size Of The Map : "+map.size());
        System.out.println(map);
         
        System.out.println("-----------------");
        
        Map<String, Double> map1 = new HashMap<>();
        map1.put("Kanhaiya", 50.60);
        map1.putAll(map);
        System.out.println(map1);
        System.out.println("Size Of The Map1 : "+map1.size());
         
        
        
        
        
        //Displaying the elements
         
        System.out.println("The elements are :");
         
        Set<String> set = map.keySet();
         
        Iterator keySetIterator = set.iterator();
         
        while (keySetIterator.hasNext()) 
        {
            Object key = keySetIterator.next();
             
            System.out.println(key+"  : "+map.get(key));
        }
         
        System.out.println("-----------------");
        
        Collection<Double> values = map.values();
        System.out.println(values);
        
         
        //Checking the map for a particular key/value
         
       /* System.out.println("Does this map has Chetan as key? "+map.containsKey("Chetan"));
         
        System.out.println("Does this map has 74.23 as value? "+map.containsValue(74.23));
         
        System.out.println("-----------------");
         
        //Removing an element from the map
         
        System.out.println("Value removed from the map : "+map.remove("Kartik"));*/
    }    
}