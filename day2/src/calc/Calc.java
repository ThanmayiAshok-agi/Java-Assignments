package calc;

import java.util.Scanner;

public class Calc {
	public static void main(String aa[])
    {
        String choice;
        Scanner scan=new Scanner(System.in);  
        do {
        System.out.println("Calculator");
        System.out.print("Enter first number:"); 
        int a= scan.nextInt(); 
        System.out.print("Enter second number:");
        int b= scan.nextInt(); 
        System.out.println("Select your operation :\n1.Addition\n2.Sub\n3.Mul\n4.Div");
        int op=scan.nextInt();
        if(op==1)
        {
            System.out.println("Addition :"+(a+b));
        }
        else if(op==2)
        {
            System.out.println("Subtraction :"+(a-b));
        }
        else if(op==3)
        {
            System.out.println("Mul :"+(a*b));
        }
        else if(op==4)
        {
            System.out.println("Division :"+(a/b));
        }else
        {

 

            System.out.println("Enter valid choice(1,2,3,4)");
        }
        System.out.println("Do you want to continue?(yes/no)");
        choice=scan.next();
        }
        while(choice.equals("YES")|| choice.equals("yes"));
        System.out.println("Thankyou!!!");
}
}