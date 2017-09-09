package lec20.collection.list;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set <String> countries=new HashSet<String>();
		
		System.out.println(countries.add("Ind"));
		countries.add("Aus");
		countries.add("SA");
		System.out.println(countries.add("Ind"));
		countries.add("c4");
		countries.add("c5");
		countries.add("c6");
		countries.add("c7");
		countries.add("c8");
		countries.add("c9");
		countries.add("c10");
		countries.add("c11");
		countries.add("c12");
		countries.add("c13");
		countries.add("c14");
		countries.add("c15");
		countries.add("c16");
		countries.add("c17");
		countries.add(null);
		countries.add(null);
		
		System.out.println(countries);
		
		//countries.remove("c17");
		
		//System.out.println(countries);
		
		
	}

}
