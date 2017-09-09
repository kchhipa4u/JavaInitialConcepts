package lec27.io.bytestreams;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
	public static void main(String[] args) {
		String txt = "Musterstrasse 45”";

		String re1 = "((?:[a-z][a-z0-9_]*))"; // Variable Name 1

		Pattern p = Pattern.compile(re1, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
		Matcher m = p.matcher(txt);
		if (m.find()) {
			String var1 = m.group(1);
			System.out.print("(" + var1.toString() + ")" + "\n");
		}
	}

	// validate address
	public static boolean validateAddress(String address) {
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	} // end method validateAddress

}