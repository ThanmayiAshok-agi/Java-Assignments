package day3;

public class Car {
	 public static void main(String aa[])
	    {
	     Ecar e=new Ecar("carx","250000");
	     System.out.print(e.getDetails());
	}
	    
	}
	    
	class Ecar
	{
	    String bname,price;
	    
	        Ecar(String n,String  pr)
	        {
	            bname=n;
	            price=pr;
	        }    
	    
	    String getDetails()
	    {
	        return bname+" "+price;
	    }
	}