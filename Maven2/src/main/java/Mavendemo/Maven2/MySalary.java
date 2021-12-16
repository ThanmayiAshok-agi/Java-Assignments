package Mavendemo.Maven2;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class MySalary {

	public MySalary()
	{
		
	}
	void display() {
		System.out.print("Enter number of hours worked: ");
        Scanner in = new Scanner(System.in);
        double totalTime = in.nextInt();
        double standardsal = 300;
        int standardHours = 180;
        double totalsal;

        if (totalTime > 180)
            totalsal = (standardsal * totalTime)
                        + (totalTime - standardHours);
        else if (totalTime < 180)
            totalsal = standardsal * totalTime;
        else
            totalsal = standardsal * standardHours;

        System.out.println("---Total Salary---");
        System.out.println("Your total salary of the month is: " + totalsal);
    }
}