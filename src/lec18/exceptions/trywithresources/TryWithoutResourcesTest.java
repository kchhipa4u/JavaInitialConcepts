package lec18.exceptions.trywithresources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class TryWithoutResourcesTest {

	public static void main(String[] args) throws IOException, FileNotFoundException, SQLException {
		FileInputStream is = null;

		try {
			is = new FileInputStream("c:/myFile.txt");
		} finally {
			System.out.println("ABCD");
			//if (is != null) {
			try{
				is.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			//}
		}
	}
}
