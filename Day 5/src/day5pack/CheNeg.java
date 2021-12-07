package day5pack;

import java.util.Scanner;

public class CheNeg {
	public static void main(String aa[]) 
    {

        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        n=s.nextInt();
        try{
         if(n<0) {
        	 System.out.println("Number is negative");
         }
        else {
                 System.out.println("Number is not negative");
                 throw new Number9("Not negative");
                 }
        }
        catch(Number9 e) {
        	System.out.println(e);
        }
    }
}
class Number9 extends Exception {
	public Number9(String message) {
		super(message);
	}
}
