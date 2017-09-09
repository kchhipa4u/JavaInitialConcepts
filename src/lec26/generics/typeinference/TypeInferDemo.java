package lec26.generics.typeinference;

public class TypeInferDemo {

	static <T> T pick(T a1, T a2) {
		return a2;
	}
	
	public static void main(String[] args) {
		 Person s = pick(new Employee(), new Student());
		
		//Student s = pick(new Student(), new Student());
		
		System.out.println(s.getName());
	}

}
