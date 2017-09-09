package lec27.io.bytestreams;
import java.util.regex.*;

class Main
{
  public static void main(String[] args)
  {
    String txt="Blaufeldweg 123B";

    String re1="((?:[a-z][a-z0-9_]*))";	// Variable Name 1
    String re2=".*?";	// Non-greedy match on filler
    String re3="(\\d+)";	// Integer Number 1

    Pattern p = Pattern.compile(re1+re2+re3,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Matcher m = p.matcher(txt);
    if (m.find())
    {
        String var1=m.group(1);
        String int1=m.group(2);
        System.out.print("("+var1.toString()+")"+"("+int1.toString()+")"+"\n");
    }
  }
}