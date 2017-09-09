package lec22.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
     
    public Employee(int id, String name) {
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(Employee emp) {
       // return this.id-emp.id;
        //return emp.id -this.id;
    	return this.name.compareTo(emp.name);  // + = Asc
    	                                       // Dec
    }
}
 
public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(3, "Ajay");
        Employee emp2 = new Employee(1, "Vijay");
        Employee emp3 = new Employee(2, "Saurav");
        Employee emp4 = new Employee(5, "Anil");
        Employee emp5 = new Employee(4, "Vineet");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
         
        Collections.sort(employees);
         
        for (Employee employee : employees) {
            System.out.println(employee.id + ", " + employee.name);
        }
    }
}