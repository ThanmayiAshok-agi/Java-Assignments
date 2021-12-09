package day6pack;

import java.util.ArrayList;

public class Mthod2 {
	public static void main(String[] args) {
	      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
	      arrlist.add(1);
	      arrlist.add(2);
	      arrlist.add(3);
	      arrlist.add(4);
	      for (Integer number : arrlist) {
	         System.out.println("Number = " + number);
	      }      
	      int retval = arrlist.size();
	      System.out.println("List consists of "+ retval +" elements");
	         
	      System.out.println(" This is for Clear Method");
	      arrlist.clear();
	      retval = arrlist.size();
	      System.out.println("It has "+ retval +" elements");
	   }
}
