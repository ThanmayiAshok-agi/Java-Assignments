package bills;
import java.util.*;
import java.util.Scanner;
public class Bills {
public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the call");
		int n=sc.nextInt();
		int bill=0;
		if(n<=100)
		System.out.println("Calls are free");
		else if(n>101 && n<=200)
		{
		bill=(n-100)*1;
		System.out.println(bill+" call bills");
		}
		else if(n>201 && n<=300)
		{
		bill=(n=200)*2+100;
		System.out.println(bill+" call bills");
		}
		else 
		{
		bill=(n=300)*3+200+100;
		System.out.println(bill+" call bills");
		}
		}
		}
