package factmeth;

import java.util.Scanner;

public class Factmethod {
	public static void main(String args[]){ 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:"); 
		int num=scan.nextInt();
		factorial(num);
		}
		static void factorial(int num)
		{
		int i,f=1;
		for(i=1; i<=num; i++){
		f=f*i;
		}
		System.out.println("Factorial of the  "+num+"is:  "+f); 
		}
}
