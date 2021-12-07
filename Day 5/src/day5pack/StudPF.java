package day5pack;

import java.util.Scanner;

public class StudPF {
	public static void main(String aa[]) 
    {

        int marks;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter marks");
        marks=s.nextInt();
        try{
         if(marks>200) {
        	 System.out.println("Passed!");
         }
        else {
                 System.out.println(" Student failed");
                 throw new Number3("failed");
                 }
        }
        catch(Number3 e) {
        	System.out.println(e);
        }
    }
}
class Number3 extends Exception {
	public Number3(String message) {
		super(message);
	}
}