package day5pack;

public class TryCatch {
	public static void main(String args[]){
	     try{
	         int a[]=new int[7];
	         a[4]=30/0;
	         System.out.println("First");
	     }
	     catch(ArithmeticException e){
	        System.out.println("Arithmetic Exception..");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("ArrayIndexOutOfBoundsException");
	     }
	     catch(Exception e){
	        System.out.println("Other");
	     }
	   System.out.println("Complete");
	  }
}
