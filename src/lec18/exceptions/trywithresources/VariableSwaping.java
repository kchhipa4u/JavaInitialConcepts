package lec18.exceptions.trywithresources;

public class VariableSwaping {
	
	public static void main(String[] args) {
		int a = 10;
		
		int b = 20;
		
		int temp;
		
		System.out.println("a and b before swaping: "+ a +" "+ b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a and b after swaping: "+ a +" "+ b);
	}

}
