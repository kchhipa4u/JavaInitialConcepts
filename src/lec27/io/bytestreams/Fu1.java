package lec27.io.bytestreams;
import java.util.Arrays;
 
public class Fu1 {
  public static void main(String[] args) {
    String[] tests = {"Winterallee 3", "Musterstrasse 45", "Blaufeldweg 123B", "Am Bächle 23"};
 
    String regex = "(?<=[\\w&&\\D])(?=\\d)";
 
    for (String test : tests) {
      System.out.println(Arrays.toString(test.split(regex)));
    }
  }
}