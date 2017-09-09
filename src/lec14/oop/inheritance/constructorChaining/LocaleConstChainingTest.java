package lec14.oop.inheritance.constructorChaining;

import java.util.Locale;

public class LocaleConstChainingTest {

	
	public static void main(String[] args) {
		            // Creates a locale object using one parameter to constructor
			        Locale locale = new Locale("fr");  
			        System.out.println("locale: "+locale);
			        System.out.println("Country "+locale.getDisplayName()); 
			        System.out.println("Country "+locale.getDisplayCountry());
			        
			        Locale l = new Locale("hi");
			        System.out.println("Country "+l.getDisplayName());
	}
}
