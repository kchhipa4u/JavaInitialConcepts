package lec8.oop.staticconcepts;
public class Demo
{
  static double $rate;
  static int numOfDollars;
  static
  {
    $rate = 66.6;
    numOfDollars = 12;
    System.out.println("I am static block, I am called first.");
  }
  public static void main(String args[])
  {
    Demo d1 = new Demo();
    System.out.println("I am main() method, executed after static block.");
    System.out.println("Dollar value in Rupees: " + $rate * numOfDollars);
  }
}