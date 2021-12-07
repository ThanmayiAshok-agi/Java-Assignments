package day3;

public class Const {
	    public static void main(String aa[])
	    {
	     Employee e=new Employee("10","25000");
	     System.out.print(e.getDetails());
	}
	    
	}
	    
	class Employee
	{
	    String id,salary;
	    
	        Employee(String x,String  sal)
	        {
	            id=x;
	            salary=sal;
	        }    
	    
	    String getDetails()
	    {
	        return id+" "+salary;
	    }
	}

