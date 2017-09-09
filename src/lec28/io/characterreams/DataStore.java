package lec28.io.characterreams;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
	public static final int TOTAL_USER_COUNT = 3;
	
	public static void loadData() {
		loadUsers();
	}	

	private static void loadUsers() {
		String[] data = new String[TOTAL_USER_COUNT];
		List<User> users = new ArrayList<>();
    	IOUtil.read(data, "User.txt");
    	int rowNum = 0;
    	for (String row : data) {
    		String[] values = row.split("\t");
    		User usr = new User();
    		usr.setName(values[0]);
    		usr.setAge(values[1]);
    		usr.setMail(values[2]);
    		usr.setGender(values[3]);
    		users.add(usr);
    	}
    	
    	System.out.println(users);
	}
	
	public static void main(String[] args) {
		loadData();
	}
}
