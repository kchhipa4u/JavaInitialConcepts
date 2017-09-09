package lec27.io.bytestreams;

public class MatchAddress {

	public static void main(String args[]) {

		isValidAddr("Winterallee 3");

		isValidAddr("John A. Smith 888 Luck Street, NY 64332-4453");

		isValidAddr("John Allen Smith 888 Luck Street, NY");

		isValidAddr("888 Luck Street, NY 64332");

		isValidAddr("P.O. BOX 888 Luck Street, NY 64332-4453");

		isValidAddr("John Allen Smith 888 Luck st., NY");
	}

	public static boolean isValidAddr(String addr) {

		boolean retval = false;

		String nameToken = "\\p{Upper}(\\p{Lower}+\\s?)";

		String namePattern = "(" + nameToken + "){2,3}";

		//String zipCodePattern = "\\d{5}(-\\d{4})?";

		/*String addressPattern = "^" + namePattern + "\\w+ .*, \\w+ "

				+ zipCodePattern + "$";*/
		
		String addressPattern = "^" + namePattern + "\\w+ .*, \\w+ "+ "$";

		retval = addr.matches(addressPattern);

		String msg = "NO MATCHnpattern:n " + addr + "nregexLength:n "

				+ addressPattern;
		
		String pattern =
			    "^" +
			    "((?:\\p{L}| |\\d|\\.|-)+?) " +
			    "((?:\\d+ ?- ?)\\d+ *[a-zA-Z]?) " +
			    "$";

		boolean isValidStreet = addr.matches(pattern);
		System.out.println(isValidStreet);
		
		if (retval) {

			msg = "MATCHnpattern:n " + addr + "nregexLength:n "

					+ addressPattern;

		}

		//System.out.println(msg + "rn");

		return retval;
	}
}