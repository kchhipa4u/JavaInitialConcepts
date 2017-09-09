package lec18.exceptions.trywithresources;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			int i = 1;
			
			System.out.println(5/i);
			
			if (i == 2) {
				throw new IOException();
				
			} 
			else if(i ==1)
			{
				throw new SQLException();
			}
			
			System.out.println("Madhu");
			
			
			// Not Execute
			// 
			//
		}
		catch (IOException ie) {
			System.out.println(ie + " IO related exception handled..r");
		}
		catch (SQLException se) {
			System.out.println(se + " SQL related exception handled..");
		}
		catch(Exception e){
			System.out.println(e +" IO related exception handle");
		}
		
		System.out.println("Anil");
	}
}
