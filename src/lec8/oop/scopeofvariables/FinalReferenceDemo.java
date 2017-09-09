package lec8.oop.scopeofvariables;

public class FinalReferenceDemo {
	
	public static void main(String[] args) {
		final int i = 12;
		//i = 15; //ERROR
		//i++; //ERROR
		final int x =10;
		//final int arr[] = new int[10];
		final int[] arr1 = {x, 2, 3, 4, 5, 6};
		for (int j : arr1)
			System.out.println(j);
				
		//arr1.
		// Now let's Modify few values in array and see the result.
		arr1[0] = 7;
		arr1[1] = 8;
		arr1[6] = 10;
		System.out.println("\n Re-Print Modified Array");
		for (int j : arr1)
			System.out.println(j);
		
		
		
		
		int[] arr2 = new int[6];
		//arr1 = arr2;
		
		arr2 = arr1;
		
	}
}
