package lec4.controlflow;

import java.util.Scanner;

/*
 * Trying nested-if and switch-case statements.
 * 
 * PrintNumberInWord (nested-if, switch-case): Write a program called PrintNumberInWord which prints 
 * "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. 
 * Use (a) a "nested-if" statement; (b) a "switch-case" statement.
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 5;  // Set the value of "number" here!
      
      System.out.println("Please enter the desired number");
      
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();
 
      // Using nested-if
      /*if (number == 1) {
         System.out.println( ...... );
      } else if ( ...... ) {
         ......
      } else if ( ...... ) {
         ......
         ......
      } else {
         ......
      }*/
 
      // Using switch-case
      switch(number) {
         case 1: System.out.println( "ONE" ); break;  // Don't forget "break"
         case 2: System.out.println( "TWO" ); break;
         //......
        // ......
         default: System.out.println( "OTHER" ); 
      }
   }
}
