package day2;

import java.util.Scanner;

public class Sumof100 {
	public static void main(String[] args) {
	    Scanner in= new Scanner(System.in);
	    
		System.out.print("Enter the value of n: ");
		int n = in.nextInt();
		
		int sum=0, num = 1, count=0;
		
		while(count<n){
		    if(num%2 == 0){
		        sum += num;
		        count++;
		    }
		    num++;
		}
		
		System.out.println("Sum: "+sum);
	}
}
