package lec29.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {

	public static void fileMethodsDemo() {
		System.out.println("\nInside fileMethodsDemo ...");

		File f = new File("C:\\Users\\kanhaiya.chhipa\\workspace\\JavaInitialConcepts\\src\\..\\logo.png"); 
		     // also
	         // works
		 //File f = new File("logo.png");

		System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
		try {
			System.out.println("getCanonicalPath(): " + f.getCanonicalPath());
			System.out.println("createNewFile(): " + f.createNewFile());
		} catch (IOException e) {
		}
		System.out.println("separator: " + f.separator);
		System.out.println("separatorChar: " + f.separatorChar);
		System.out.println("getParent(): " + f.getParent());
		System.out.println("lastModified(): " + f.lastModified());
		System.out.println("exists(): " + f.exists());
		System.out.println("isFile(): " + f.isFile());
		System.out.println("isDirectory(): " + f.isDirectory());

		System.out.println("My working or user directory: " + System.getProperty("os.name"));
		System.out.println("new File(\"testdir\").mkdir(): " + new File("testdir").mkdir());
		System.out.println("new File(\"testdir\\test\").mkdir(): " + new File("testdir\\test").mkdir());
		System.out.println("new File(\"testdir\").delete(): " + new File("testdir").delete());
		System.out.println("new File(\"testdir\\test1\\test2\").mkdir(): " + new File("testdir\\test1\\test2").mkdir());
		System.out
				.println("new File(\"testdir\\test1\\test2\").mkdirs(): " + new File("testdir\\test1\\test2").mkdirs());

		try {
			File f2 = new File("temp.txt");
			System.out.println("f2.createNewFile(): " + f2.createNewFile());
			System.out.println("f2.renameTo(...): " + f2.renameTo(new File("testdir\\temp1.txt"))); // move!!
		} catch (IOException e) {
		}

	}

	public static void dirFilter(boolean applyFilter) {
		System.out.println("\nInside dirFilter ...");

		File path = new File(".");
		System.out.println(path.getAbsolutePath());
		String[] list;

		if (!applyFilter)
			list = path.list();
		else
			list = path.list(new DirFilter());

		// Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list)
			System.out.println(dirItem);
	}

	public static void main(String[] args) {
		fileMethodsDemo();
		dirFilter(true);
	}
}

class DirFilter implements FilenameFilter {
	// Holds filtering criteria
	public boolean accept(File file, String name) {
		return name.endsWith(".txt") || name.endsWith(".txt");
	}

}
