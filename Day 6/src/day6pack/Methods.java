package day6pack;

import java.util.ArrayList;

public class Methods {
	public static void main(String[] args) {
	      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

	      arrlist.add(15);
	      arrlist.add(20);
	      arrlist.add(25);
	      arrlist.add(30);
	      for (Integer number : arrlist) {
	         System.out.println("Values = " + number);
	      } 
	      int ret = arrlist.get(2);
	      System.out.println("The Retrieved element is  " + ret);	   
	   }
}
