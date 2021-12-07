package Pos;

import java.util.Scanner;

public class PosiNeg {
	public static void main(String[] args) 
    {
		PosiNeg p = new PosiNeg();
		p.PosiNeg1(50);
    }
	public static int PosiNeg1(int number) {
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
		return number;
    }
}