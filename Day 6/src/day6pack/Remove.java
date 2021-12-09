package day6pack;

import java.util.ArrayList;

public class Remove {
	public static void main(String[] args) {
	      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

	      arrlist.add(1);
	      arrlist.add(3);
	      arrlist.add(5);
	      arrlist.add(7);

	      System.out.println("Size of list: " + arrlist.size());
	      for (Integer number : arrlist) {
	         System.out.println("Number is " + number);
	      }  
	      arrlist.remove(2);

	      System.out.println("Now, Size of list: " + arrlist.size());
	      for (Integer number : arrlist) {
	         System.out.println("Number is " + number);
	      }
	   }
}
