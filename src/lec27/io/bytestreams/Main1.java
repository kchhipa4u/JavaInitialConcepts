package lec27.io.bytestreams;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

	private static final Pattern VALID_PATTERN = Pattern.compile("[0-9]+|[A-Z]+");

	private static List<String> parse(String toParse) {
	    List<String> chunks = new LinkedList<String>();
	    Matcher matcher = VALID_PATTERN.matcher(toParse);
	    while (matcher.find()) {
	        chunks.add( matcher.group() );
	    }
	    return chunks;
	}
	
	public static void main(String[] args) {
		System.out.println(parse("Winterallee 3"));

	}

}
