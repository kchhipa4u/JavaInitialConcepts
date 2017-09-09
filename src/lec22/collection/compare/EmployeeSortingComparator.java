package lec22.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp{
    int id;
    String name;
     
    public Emp(int id, String name) {
        this.id=id;
        this.name=name;
    }
}

class EmpComparatorByID implements Comparator<Emp>
{
    @Override
    public int compare(Emp emp1, Emp emp2) {
        return emp1.id-emp2.id;
    }
}

class EmpComparatorByName implements Comparator<Emp>
{
    @Override
    public int compare(Emp emp1, Emp emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}
 
public class EmployeeSortingComparator {
    public static void main(String[] args) {
        List<Emp> Emps = new ArrayList<>();
        Emp emp1 = new Emp(3, "Ajay");
        Emp emp2 = new Emp(1, "Vijay");
        Emp emp3 = new Emp(2, "Saurav");
        Emp emp4 = new Emp(5, "Anil");
        Emp emp5 = new Emp(4, "Vineet");
        Emps.add(emp1);
        Emps.add(emp2);
        Emps.add(emp3);
        Emps.add(emp4);
        Emps.add(emp5);
         
        Collections.sort(Emps, new EmpComparatorByName());
         
        for (Emp Emp : Emps) {
            System.out.println(Emp.id + ", " + Emp.name);
        }
    }
}