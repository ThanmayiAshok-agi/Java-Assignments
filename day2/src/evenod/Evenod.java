package evenod;

import java.util.Scanner;

public class Evenod {
	 public static void main(String[] args){
		 Evenod o = new Evenod();
		 o.Evenod1(6);
	 }
		    Scanner in = new Scanner(System.in);
		    public static int Evenod1(int x) {
		    if (x % 2 == 0)
		      System.out.println("The number is even");
		    else 
		      System.out.println("The number is odd");
		    return x;
		    }
		}
