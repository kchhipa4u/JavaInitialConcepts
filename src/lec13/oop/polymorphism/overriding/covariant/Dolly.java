package lec13.oop.polymorphism.overriding.covariant;
class Dolly implements Cloneable
{
   long fur = 123456;
     
   public Dolly clone() throws CloneNotSupportedException {
      try {
         return (Dolly) super.clone();
      }
      catch(CloneNotSupportedException e) {
         throw e;
      }
   }
     
   public String toString() {
      return ""+fur;
   }
   
   public static void main(String []args) {
	      Dolly d1 = new Dolly();
	      Dolly d2 = null;
	        
	      try {
	         d2 = d1.clone();
	      }
	      catch(CloneNotSupportedException e) {
	      }
	        
	      System.out.println(d1);
	      System.out.println(d2);
	   }
}