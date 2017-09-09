package lec14.oop.inheritance.objectClass;

public class Employee {

	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		//return "Employee [name=" + name + ", age=" + age + "]";
		return ""+name+" "+age;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	
	/*public boolean equals(Object obj) {
        return (this == obj);
    }*/
	
	/*@Override
	public boolean equals(Object obj) {    // Object obj = new Employee("Anil", 31);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;   // Employee other = new Employee("Anil", 31);
		                               																				// CHILD
	//	Employee other =  obj;
		//	obj.																								//name
		if (age != other.age)																					//age
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	
   
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Anil", 30);
		Employee e2 = new Employee("Anil", 30);
		//System.out.println(e1.equals(e2));
		
		String a = "KAn";
		String b = "Kan";
		System.out.println(a.equals(b));
		
		/*System.out.println(e1.getName());
		System.out.println(e2.getName());
		
		System.out.println(e1.getAge());
		System.out.println(e2.getAge());*/
		
		//System.out.println(e1.hashCode());
		//System.out.println(e2.hashCode());
		
		//System.out.println("equality check using == " +(e1 == e2));
		
		//System.out.println("Equality check for Employee Class objects:" + e1.equals(e2));
		
		/*String s1 = "Anil";
		String s2 = "Anil";
		System.out.println("Equality check for String class objects: " + s1.equals(s2));*/
		
		
		//Class class1 = e1.getClass();
		//System.out.println(class1.getName());
		
		
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
