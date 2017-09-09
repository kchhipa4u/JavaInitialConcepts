package lec28.io.characterreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromTextFile {

	public static void main(String[] args) {

		StringBuilder text = new StringBuilder();

		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(new FileInputStream("E:\\kan.txt"), "UTF-8"))) {
			String line;
			while ((line = in.readLine()) != null) {
				text.append(line).append("\n");
			}
			System.out.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
