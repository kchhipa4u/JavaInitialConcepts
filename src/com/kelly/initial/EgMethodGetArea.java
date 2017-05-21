package com.kelly.initial;

public class EgMethodGetArea {
	   // The entry main method
	   public static void main(String[] args) {
	      double r = 1.1, area, area2;
	      
	      // Call (Invoke) method getArea()
	      area = getArea(r);
	      System.out.println("area is " + area);
	      // Call method getArea() again
	      area2 = getArea(2.2);
	      System.out.println("area 2 is " + area2);
	      // Call method getArea() one more time
	      System.out.println("area 3 is " + getArea(3.3));
	      
	      System.out.println(area);
	   }
	 
	   // Method getArea() Eefinition. // Compute and return the area (in double) of 
	   //circle given its radius (in double).
	   public static double getArea(double radius) {
	      return radius * radius * Math.PI;
	   }
	}
