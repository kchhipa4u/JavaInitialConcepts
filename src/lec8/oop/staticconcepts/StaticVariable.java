package lec8.oop.staticconcepts;

public class StaticVariable {
	int				rollno;   /// state
	String			name;    // state
	static String	college	= "IIT-DELHI";

	StaticVariable( int r, String n ) {
		rollno = r;
		name = n;
	}

	void display( ) {
		System.out.println( rollno + " " + name + " " + college + "\n" );
	}

	public static void main( String args[] ) {

		StaticVariable s1 = new StaticVariable( 111, "Karan" );
		StaticVariable s2 = new StaticVariable( 222, "Aryan" );
		
		s1.display( );

		StaticVariable.college = "IIT-BOMBAY"; // s1.college = "ASCOL"

		s1.display( );
		s2.display( );
	}

}
