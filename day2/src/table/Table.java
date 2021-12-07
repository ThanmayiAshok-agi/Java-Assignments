package table;

import java.util.Scanner;

public class Table {
	 public static void main(String args[]) {
	        int num;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number:");
	        num = sc.nextInt();

	        int i = 1;

	        while (i <= 10) {
	            System.out.println(i * num);
	            i++;
	        }

	    }

}
