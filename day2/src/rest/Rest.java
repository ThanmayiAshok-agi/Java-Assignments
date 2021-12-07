package rest;

import java.util.Scanner;

public class Rest {
	public static void main(String aa[])
    {
        String choice;
        Scanner scan=new Scanner(System.in);  
        do {
        System.out.println("Restaurant Bill");
        System.out.println("Select your choice :\n1.Breakfast\n2.Lunch\n3.Dinner");
        int op=scan.nextInt();
        if(op==1)
        {
            System.out.println("Coffee=Rs 50");
            System.out.println("Sandwich=Rs 150");
        }
        else if(op==2)
        {
            System.out.println("Juice=Rs 70");
            System.out.println("Meals= Rs 200");
        }
        else if(op==3)
        {
            System.out.println("Pizza=Rs 300");
            System.out.println("Pasta=Rs 240");
        }
        else
        {
            System.out.println("Enter valid choice(1,2,3)");
        }
        System.out.println("Do you want to order some thing more(yes/no)");
        choice=scan.next();
        System.out.println("--Total Amount--");
        if(op==1) {
        	System.out.println("Total Bill is Rs 200");
        }
        if(op==2) {
        	System.out.println("Total Bill is Rs 270");
        }
        else if(op==3 ){
        	System.out.println("Total Bill is Rs 540");
        
        System.out.println("Do you want to continue?(yes/no)");
        choice=scan.next();
        }
        }
        while(choice.equals("YES")|| choice.equals("yes"));
        System.out.println("Thank You");
}
}