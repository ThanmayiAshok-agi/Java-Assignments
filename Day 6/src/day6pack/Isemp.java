package day6pack;

import java.util.ArrayList;

public class Isemp {
	public static void main(String[] args) {
	      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
	      arrlist.add(2);
	      arrlist.add(4);
	      arrlist.add(6);
	      arrlist.add(8);        
	              
	      boolean ret = arrlist.isEmpty();
	      if (ret == true) {
	         System.out.println("list is empty");
	      } else {
	         System.out.println("list is not empty");
	      }
	      for (Integer number : arrlist) {
	         System.out.println("Number is " + number);
	      }
	   }
}
