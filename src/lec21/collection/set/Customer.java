package lec21.collection.set;
class Customer
{
    String name;
 
    int id;
 
    public Customer(String name, int id)
    {
        this.name = name;
 
        this.id = id;
    }
 
   @Override
    public int hashCode()
    {
        return id;
    }
   
    @Override
    public boolean equals(Object obj)           // new Customer("Anil", 2)
    {
        Customer customer = (Customer) obj;
 
        return (id == customer.id);                         // new Customer("Sunil", 2)
    }
   
 
    @Override
    public String toString()
    {
        return id+" : "+name;
    }
}