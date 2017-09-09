package lec17.exceptions.fundamentals;

/**
 * @author kanhaiya.chhipa
 * 
 * This is case of NullPointerException  (RuntimeException)
 *
 */
public class GeneralException {

	static String name = null;
	
	public static void main(String[] args) {
		System.out.println(getNameSize());
	}
	
	static int getNameSize()
	{
		return name.length();
	}
}
