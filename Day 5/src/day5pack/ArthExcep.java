package day5pack;

public class ArthExcep {
	public static void main(String args[])
	   {
	      try{
	         int n1=5, n2=0;
	         int output=n1/n2;
	         System.out.println ("Result is "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("Cannot divide by zero");
	      }
	   }
}
