package lec25.collection.map.linkedhasmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
		Map<Bike, Object> bikes = new HashMap<Bike, Object>();

		Bike cbr250r = new Bike("Honda", 250);
		Bike cbr1000rr = new Bike("Honda", 1000);
		Bike ninja250r = new Bike("Kawasaki", 250);
		Bike ninja1000rr = new Bike("Kawasaki", 1000);

		bikes.put(cbr250r, null);
		bikes.put(cbr1000rr, null);
		bikes.put(ninja250r, null);
		bikes.put(ninja1000rr, null);
		
		for(Entry<Bike, Object> b : bikes.entrySet()){
			System.out.println(b);
		}

	}
}