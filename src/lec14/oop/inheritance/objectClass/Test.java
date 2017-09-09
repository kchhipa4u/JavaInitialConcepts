package lec14.oop.inheritance.objectClass;
public class Test
{
    public static void main(String[] args)
    {
        Object obj = new String("abcd");
        Class c = obj.getClass();
        System.out.println("Class of Object obj is : "
                           + c.getName());
    }
}