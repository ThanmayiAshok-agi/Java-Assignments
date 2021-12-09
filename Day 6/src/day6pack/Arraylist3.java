package day6pack;

import java.util.ArrayList;

public class Arraylist3 {
	public static void main(String args[]) 
    {        
        ArrayList<Employee> list=new ArrayList<>();
        Employee e1=new Employee("a", "10");
        Employee e2=new Employee("b", "11");
        list.add(e1);
        list.add(e2);
        list.add(new Employee("c","22"));
        
        for(Employee  x  : list)
        {
        System.out.println(x);    
        }
    }
}
class Employee
{
    String name,id;
public Employee(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }
public String getName() {
        return name;
    }
public void setName(String name) {
        this.name = name;
    }
public String getId() {
        return id;
    }
public void setId(String id) {
        this.id = id;
    }
public String toString()
    {
    return "Name :"+name+"\nId  :"+id;
    }
}
