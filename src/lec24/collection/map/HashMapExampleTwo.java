package lec24.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExampleTwo 
{    
    public static void main(String[] args) 
    {
        //Creating HashMap with default initial capacity and load factor
         
        Map<String, Integer> map = new HashMap<>();
         
        //Adding key-value pairs
         
        map.put("ONE", 1);
         
        map.put("TWO", 2);
         
        map.put("THREE", 3);
         
        map.put("FOUR", 4);
         
        //Adds key-value pair 'ONE-111' only if it is not present in map
         
        //map.put("ONE", 111);
       map.putIfAbsent("ONE", 111);
        
         
        //Adds key-value pair 'FIVE-5' only if it is not present in map
         
        map.putIfAbsent("FIVE", 5);
         
        //Printing key-value pairs of map
         
        Set<Entry<String, Integer>> entrySet = map.entrySet();
                 
        for (Entry<String, Integer> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }        
    }    
}