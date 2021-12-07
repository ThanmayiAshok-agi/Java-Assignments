package day5pack;

import java.util.Scanner;

public class CheckEven {
	public static void main(String aa[]) 
    {

        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any number");
        n=s.nextInt();
        try{
         if(n%2==0) {
        	 System.out.println("Number is even");
         }
        else {
                 System.out.println(" Number is not even");
                 throw new Number5("Not even");
                 }
        }
        catch(Number5 e) {
        	System.out.println(e);
        }
    }
}
class Number5 extends Exception {
	public Number5(String message) {
		super(message);
	}
}
