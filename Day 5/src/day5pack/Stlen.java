package day5pack;

import java.util.Scanner;

public class Stlen {
	public static void main(String aa[]) throws Number7 
    {

        String str;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter string");
        str=s.next();
        try {
        if(str.length()>0) {
        	 System.out.println("Length is "+str.length());
        }
        	 else {
         str = "";  
             System.out.println("String is empty now: "+str.length()); 
             throw new Number7("failed");
    }
}
        	 catch(Number7 ee) {
        		 System.out.println(ee);
        	 }
        }
        }
class Number7 extends Exception {
	public Number7(String message) {
		super(message);
	}
}
