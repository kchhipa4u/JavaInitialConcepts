package lec7.javabasic.arrays;
public class Array2DExample {
    public static void main(String[] args) {
 
            // Declare and initialize 2D Array
    	
    	  // int int2dArray[][] = new int[2][];
           int int2dArray[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
 
           // Method 1 - To Iterate over 2d array > using enhanced for loop
           // array of Array
           //int2dArray[0][1]
           for (int[] i : int2dArray) {   // Row
                  for (int j : i) {       //Column
                        System.out.print(j + " ");
                  }
                  System.out.println();
           }
           
           System.out.println("Size of array " + int2dArray.length);
           
         System.out.println();  
         System.out.println("Method 2 Iterate over 2d array > using for loop");
           
        // Method 2 Iterate over 2d array > using for loop
           for (int i = 0; i < int2dArray.length; i++) {
                  for (int j = 0; j < int2dArray[i].length; j++)
                        System.out.print(int2dArray[i][j] + " ");
                  System.out.println();
           }
 
    }
}