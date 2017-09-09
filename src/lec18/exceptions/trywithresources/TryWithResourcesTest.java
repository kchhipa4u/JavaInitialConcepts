package lec18.exceptions.trywithresources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourcesTest {

	public static void main(String[] args) throws IOException {

		//InputStream is = null;  // we can't initialize class outside try block
		try (InputStream is = new FileInputStream("c:/myFile.txt")) {
			// other code goes here
		}
	}
}
