package day5pack;

import java.util.Scanner;

public class Array4 {
	public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
       
    int numbers[]= new int[size];
    System.out.println("Enter the elements of the array ");
    for(int i=0;i<size;i++)
    {
    numbers[i]=s.nextInt();
    }      
   
    System.out.println("Printing all the elements of array");
    for(int i=0;i<numbers.length;i++)
    {
        System.out.println(numbers[i]);
    }
       
    }
}
