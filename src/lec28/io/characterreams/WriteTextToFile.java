package lec28.io.characterreams;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteTextToFile {
	public static void main(String[] args) {

		String text = "Hi, this is Anil";

		try (BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("E:\\kan.txt"), "UTF-8"))) {

			out.write(text);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
