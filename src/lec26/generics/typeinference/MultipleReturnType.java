package lec26.generics.typeinference;

import java.time.LocalDate;
import java.util.Date;

public class MultipleReturnType {

	public <T> T shareItems(Person p, String...strings){
		// Your Business Logic
		//return (p != null) ? new Date() : LocalDate.now();
		
		//return (T instanceof Date) ? (T) new Date() : (T) LocalDate.now();
		
		if (T instanceof Date)
            return (T) new Date();
        if (T instanceof LocalDate)
            return (T) LocalDate.now();
	}
}
