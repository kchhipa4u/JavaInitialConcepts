package lec14.oop.inheritance.objectClass;
public class Student
{
    static int last_roll = 100; 
    int roll_no;
    
    String name;
 
    // Constructor
    Student()
    {
        roll_no = last_roll;
        last_roll++;
    }
    
    Student(String name){
    	this.name = name;
    }
 
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roll_no;
		return result;
	}
      
 
    @Override
	public String toString() {
		return "Student [roll_no=" + roll_no + "]";
	}
    

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll_no != other.roll_no)
			return false;
		return true;
	}

	// Driver code
    public static void main(String args[])
    {
        Student s = new Student();
 
        // Below two statements are equivalent
        System.out.println(s);
        System.out.println(s.toString());
        
        System.out.println(s.hashCode());
        
        Student s1 = new Student();
        
        System.out.println(s1.hashCode());
        
        Student ss1 = new Student("Anil");
        
        Student ss2 = new Student("Anil");
        
        System.out.println(ss1.equals(ss2));
    }
}